interface S{

   void m1();
}

class Test implements S{


      public  void m1()
      {
         System.out.println("MEthod");
      }
   
    public static void main(String[] args) {

          S s1=new Test() ;
     int a[]=new int[5];  
        System.out.println(a.length);   
     
    }
}
