package Todo;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Db {
	static String path;
	
	Db(){}
	
	Db(String path)
	{
		this.path=path;
	}
	
	public static void addTask()throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTRE YOUR TASK");
    	String s=sc.nextLine();
    	  ArrayList al = new ArrayList();
    		al.add(new Task(s));
    		writeObj(al);
    		System.out.println("Task Added");		
	}
	
   public static void writeObj(Object ob)throws Exception{
	   
	   FileOutputStream fos=new FileOutputStream(path,true);
	   ObjectOutputStream oos=new ObjectOutputStream(fos);
	   oos.writeObject(ob);
	   oos.close();
   }
   
   public static Object readObj(String path)throws Exception{
	   
	   FileInputStream fis = new FileInputStream(path);
	   ObjectInputStream ois = new ObjectInputStream(fis);
	   return ois.readObject();
	   
   }
   public static Object readObj()throws Exception{
	   
	   FileInputStream fis = new FileInputStream(path);
		ArrayList arr=new ArrayList();
		try {
	    	for(int i=0;i<8;i++)
	     	{
	         	ObjectInputStream ois=new ObjectInputStream(fis);
	        	arr.add(ois.readObject());
	    	}
		}
		catch(Exception a)
		{
			
		}
    
	   return arr;
	   
   }
}
