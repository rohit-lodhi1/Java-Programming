class Test{


  static{  //static block
    Test t=new Test();  
    System.out.println("static");
  }

  {     // non static block
    System.out.println("non - static");
  }

  Test()  // constructor
  {
    System.out.println("constructor");
  }

  public void fun(){ // non static method
     System.out.println("non static fun");
  }

  public static void main(String[] args){
     
     System.out.println("main");
        
  }
}