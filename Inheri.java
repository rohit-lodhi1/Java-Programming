class Parent{

      Parent()
      {
         System.out.println("Parent constructor");
      }

	public void m1(){
		System.out.println("p m1");
	}
	
	public void m2(){		
		System.out.println("p m2");
	}
}

class Test extends Parent{

   Test()
   {
   	 this(10);
   	 System.out.println("Test constructor");
   }

   Test(int a)
   {
   	 super();
     System.out.println("Test constructor"+a);
   	 m1();
   }
    
	public static void main(String[] args){
		 Test t=new Test();
		 t.m1();
		 t.m2();
	//	 t.m3();
	}
}