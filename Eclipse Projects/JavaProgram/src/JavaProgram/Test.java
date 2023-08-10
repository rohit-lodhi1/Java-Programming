package JavaProgram;
import java.util.*;
public class Test extends  Abs{
	
	protected void fun1()
	{
		
	}	
	public static void main(String[] args) {
		Test t=new Test();
		SingleTon s1;
		Scanner sc=new Scanner(System.in);
	//	String s = sc.nextLine();
	     Integer i=10;
		char a[]= {'1','2'};
		//System.out.println(Integer.parseInt(s,16));
		
	/*	MyArrayList al=new MyArrayList(true);
	   Computer c=new Computer();
		al.add(new Computer("Intel","i5",8,512));
		al.add(new Computer("HP","i9",32,256));
		al.add(new Computer("HP","i9",32,256));
		al.add(new Computer("Dell","i7",16,1024)); */
		MyArrayList al2=new MyArrayList(); 
		al2.add(10);		
		al2.add(20);
		al2.add(30);	
		al2.add(40);
		al2.addAtFirst(5);
		al2.addAtFirst(0);
		al2.groupReverse(3);
	//	System.out.println(al2);
		//System.out.println(s);
	
	//	System.out.println("hello");
	//	al.reverse();
	//	System.out.print(al.valueOf(98));
	//	Computer c1=new Computer("Tnetel","i20",4,999);
//		Computer c2=new Computer("Tnetel","i20",4,999);
	//	System.out.print(al.values[2].equals(al.values[1]));
	}
}