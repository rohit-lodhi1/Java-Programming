class Test{
     
	public static void main(String[] args) {
		Student s=new Student("abc","bholaram",20);
     //     Student s1=new Student("xyz","bholaram",20);
		System.out.println(s);
     //     System.out.println(s1);
          System.out.println();
	}
}

	class Student{
        String name,address;
        int roll;
       Student()
        {
             System.out.println("no args constructor");
        }
        Student(String n,String add,int r)
        {
           name=n;
           address=add;
           roll=r;
           System.out.println("param constructor");
        }
        public String toString(){
             return name+" "+address+" "+roll;
        } 
}   
/*next */
/* 
class Test{

     Test(int a,int b){

          if(a<b)
               System.out.println("greater"+b);
          else
               System.out.println("greater"+a);
     }

     public static void main(String[] args) {
          
          Test t=new Test(10,20);
     }
}

*/