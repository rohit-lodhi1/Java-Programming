package ToDoList;
import java.io.*;
import java.util.ArrayList;

public class Db {
String path;
	
	Db(String path)
	{
       	this.path=path;
	}
	
	public void writeObj(Object val) {
		try {
			 FileOutputStream fos = new FileOutputStream(path);
          ObjectOutputStream  write = new ObjectOutputStream(fos);
			write.writeObject(val);
		//	write.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	public Object readObj()throws Exception {
	
			 FileInputStream fos = new FileInputStream(path);
           ObjectInputStream  read = new ObjectInputStream(fos);
	    Object val=read.readObject();
		return val;
	}
	/*
	public Object readAllObj()
	{
		ArrayList al= new ArrayList();
		for(int i=0;i<)
	}*/
	
	public Object get()
	{
		try {
			return readObj();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
		return null;
	}
	
	public void insert(Object val){
		ArrayList al = new ArrayList();
		al.add(val);
	         writeObj(al);	    
	}
	
	public void insert(ArrayList al)
	{
		
		writeObj(al);
	}
	
	public void insert(Integer i)
	{
		writeObj(i);
	}
	
	public Object getAll()
	{
		try {
		return readObj();
		}
		catch(Exception e)
		{
			
		}
		return null;
	}
}
