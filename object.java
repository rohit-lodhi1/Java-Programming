/* object creating*/
/*
class Sample{


}
class Test{

	public static void main(String[] args) {
		
		Object ob=new Test();
		Test t=(Test)ob;
		System.out.println(t);
	}
}  */

/*Class Caste Exception*/
/*
class Sample{


}
class Test{

  //   int a=2;
	public static void main(String[] args) {
		
		Object ob=new Object();
		Test t=(Test)ob;

		System.out.println(t);
	}

	
} 						
*/

class Test{

	String a;
	public static void main(String[] args) {
		
		Object ob=new Test();
		Test t=(Test)ob;
		Test t1=new Test("hello");
	//	System.out.println(t);
		System.out.println(t.a);
	}
	Test()
	{

	}
	Test(String b)
	{
		a=b;
		
	}

	public String toString()
	{
		return a;
	}
}











