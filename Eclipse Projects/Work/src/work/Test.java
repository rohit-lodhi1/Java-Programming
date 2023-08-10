package work;
/*
import java.util.Scanner;

 class Iron{
	static int a=10;
	Iron(){
		System.out.println("Iron COnstructor");
	}
	static {
		System.out.println("Iron");
	}
	public void getinfo()
	{
		System.out.println("Iron Man");
	}
	public String toString()
	{
		return "LEGENDARY IRONMAN";
	}
}
class Cap{
	static {
		System.out.println("Cap");
	}
	public void getinfo()
	{
		System.out.println("Cap America");
	}
}
class Spider{
	static {
		System.out.println("Spider");
	}
	public void getinfo()
	{
		System.out.println("Spider Man");
	}
}
class Bucky{
	static {
		System.out.println("Bucky");
	}
	public void getinfo()
	{
		System.out.println("Bucky superSoldier");
	}
}

public class Test {
	public static void main(String[] args)throws Exception {
		MYArray al= new MYArray(false);
		Comp c1 = new Comp("intel","6",256,4);
	//	Comp c2 = new Comp("intel","7",256,4);
		al.add(new Comp("intel","6",256,4));
		al.add(new Comp("intel","6",256,4));
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
	//	al.reverse();
		MYArray al1=new MYArray(c1);
		al1.add(10);
		al1.add(10);
		System.out.print(al1);    
	//	StringBuffer s=new StringBuffer("hello");
		//   s.append("rohi");
		Scanner sc=new Scanner(System.in);
	//	String name=sc.next();
		Class c=Class.forName("work.Iron"); 
		Object ob=c.newInstance();
	//	Object ob=new Iron();
		if(ob instanceof Iron)
		{
			Iron s=(Iron)ob;
			s.getinfo();
		}
		if(ob instanceof Cap)
		{
			Cap s=(Cap)ob;
			s.getinfo();
		}
		if(ob instanceof Spider)
		{
			Spider s=(Spider)ob;
			s.getinfo();
		}
		if(ob instanceof Bucky)
		{
			Bucky s=(Bucky)ob;
			s.getinfo();
		}
		//ob=ob.getClass();
		   System.out.println(ob);
	}	
} 
*/

import java.io.*;

public class Test{		
	
public static void main(String[] args)throws Exception {
    File f=new File("C:\\abc\\xyz.txt");
    
    FileWriter f2=new FileWriter(f);
    f2.write("HELLO HOW ARE YOU");
    f2.close();
    
    FileReader f1=new FileReader(f);
    int i;
    while((i=f1.read())!=-1)
    {
    	System.out.print((char)i);
    }
    f1.close();
}
}