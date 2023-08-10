


package files;
//import java.files.Rec;
import java.io.*; 
 
 
class Address implements Serializable{
	String city,state;
	Address(String city,String state){
		this.city=city;
		this.state=state;
	}
}

class Emp implements Serializable{
	int id;
	transient int salary;
	String name;
		Address add;
	public Emp(int id, int salary, String name,String city,String state) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.add=new Address(city,state);
	}
	Emp(){} 
}


public class Seriliz{

	public static void main(String[]args)throws Exception{
		Emp e=new Emp(100,3000,"Rohit","bhopal","MP");
		WriteObj(e);
		 Emp t=(Emp)  readObj();
		 System.out.println(t.id);
		 System.out.println(t.name);
		 System.out.println(t.salary);
		 System.out.println(t.add.city);
		 System.out.println(t.add.state);
		
	}
	
	public static void WriteObj(Object e)throws Exception {
	    //  SERIALISATION
		
		//Emp e=new Emp(100,3000,"Rohit");
		FileOutputStream fos=new FileOutputStream("C:\\abc\\xyz1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
	}
	
	public static Object readObj()throws Exception
	{
		//   DESERIALISATION
		
		FileInputStream fin=new FileInputStream("C:\\abc\\xyz1.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
         return ois.readObject();
	}
}


/*

class Emp implements Serializable{
	int id;
	int salary;
	String name;

	static String com="HELLOS";
	public Emp(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		
	}
	Emp(){}
}

public class Seriliz{

	public static void main(String[]args)throws Exception{
		//Emp e=new Emp(100,3000,"Rohit");
	//	Emp e1=new Emp(101,4000,"SUMI");
	//	Emp e2=new Emp(102,5000,"MOHIT");
	//	WriteObj(e);
	//	WriteObj(e1);
	//	WriteObj(e2);
		
		Object arr[]=readObj();
		for(int i=0;i<=2;i++)
		{
			Emp e=(Emp)arr[i];
			System.out.println(e.name);
			System.out.println(e.id);
			System.out.println(e.salary);
		}
	//	 System.out.println(t.com);		
	}
	
	public static void WriteObj(Object e)throws Exception {
		//  SERIALISATION
		
		//Emp e=new Emp(100,3000,"Rohit");
		FileOutputStream fos=new FileOutputStream("C:\\abc\\xyz.txt",true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		fos.close();
	}
	
	public static Object[] readObj()throws Exception{
		//   DESERIALISATION
		
		FileInputStream fin=new FileInputStream("C:\\abc\\xyz.txt");
		Object arr[]=new Object[5];
		for(int i=0;i<=2;i++)
		{
		ObjectInputStream ois=new ObjectInputStream(fin);
		arr[i]=ois.readObject();
		}
         return arr;
	}
}
*/