package work;
/*
public class Excp {

	public static void main(String[] args){
         
		System.out.println("HELLO");

        try { 
		System.out.println(10/2);   //  ---->>>>   No runtime Exception generate chances 
		                            //  ---->>>>   so Catch block will not execute
        }
        catch(Exception e){
        	System.out.println("EXCEPTION GENERATED");
        }
         
         System.out.println("HI");                       //    OutPut{
                                                         //             HELLO
                                                         //             5
                                                         //             HI 
                                                         //            }

	}
                                                             
}   
 
 */

/*
public class Excp {

	public static void main(String[] args){
         
		System.out.println("HELLO");

        try { 
		System.out.println(10/0);   //  ---->>>>   ArithMetic Exception will generate   so this line converted into throw ArithmeticException();    
		                            //  ---->>>>   so Catch block will execute and catch the Exception in Exception class reffVari so that 
		                            //  ---->>>>   the program will execute the other lines and the Exception is handled so that the program will execute properly
        }
        catch(Exception e){
        	System.out.println("EXCEPTION GENERATED");
        }
         
         System.out.println("HI");                       
                                                         //    OutPut{
                                                         //            HELLO
                                                         //             EXCEPTION GENERATED
                                                         //             HI 
                                                         //             }
	}
}

*/
/*
public class Excp {

	public static void main(String[] args){
         
		System.out.println("HELLO");

        try { 
		System.out.println(10/0);   //  ---->>>>   Runtime Exception generate catch block will catch the Exception 
		                            //  ---->>>>   or if Exception not generate then only try block will execute catch block will not execute 		                           
		                            //  ---->>>>   so Catch block will not execute
        }
        catch(Exception e){
        	System.out.println("EXCEPTION GENERATED");
        	System.out.println(10/0);
        }
        finally {
        	System.out.println("Finally ");   //  ---->>>>  finally block will execute definetly even if Exception generate or not 
        }
         
         System.out.println("HI");                     //      OutPut{
                                                       //               HELLO
                                                       //               EXCEPTION GENERATED
                                                       //               Finally
                                                       //               HI 
                                                       //               }
	}
}
 */
/*
public class Excp {

	public static void main(String[] args)throws Exception{
		Excp e=new Excp();
		System.out.println("HELLO");
        String s[]= null;
        try { 
    		
    	   //  String s=new String();
    	     
    	     System.out.println(10/0);
        }
        catch(ArithmeticException a)
        {
             System.out.println("Arithmetic expression");       	
        }
        try {
        	System.out.println(s[2]);
        }
        catch(NullPointerException n)
        {
        	System.out.println("NULL POINTER EXCEPTION");
        }
        catch(ArrayIndexOutOfBoundsException T)
        {
        	System.out.println("Array out of Bounds EXCEPTION");
        }
        finally {
        	 System.out.println(10/0);
        }
        catch(Exception s) {
        	
        }
	}
}	
*/
/*
public class Excp {

	public static void main(String[] args) {
       System.out.println("Main Start");
       fun1();
       System.out.println("Main End");
	}

	public static void fun1() {
		 System.out.println("Fun1 Start");
	       fun2();
	       System.out.println("Fun1 End");		
	}

	public static void fun2() {
		 System.out.println("Fun2 Start");
		 try {
		 Class.forName("Test");
		 }
		 catch(ClassNotFoundException a)
		 {
		  System.out.println(a.toString());
		 }
		 System.out.println("Fun2 End");
	}
}
*/


class  Insuffiecient extends Exception{        //custom Exception creation
	
	Insuffiecient(String msg) {
		super(msg);
	}
	
}

class Account{
	private int balance=0;
	Account(int balance){
		this.balance=balance;
	}
	public int withdrawl(int amount) throws Insuffiecient{
		if(balance<amount)
		{
			throw new Insuffiecient("INSUFFIECIENT BALANCE");
		
		}
		else {
			balance-=amount;
			return amount;
		}
	}
}

public class Excp{
	public static void main(String[] args){
		Account ac=new Account(2000);
		try {
		System.out.println(ac.withdrawl(1500));
		System.out.println(ac.withdrawl(100));
		System.out.println(ac.withdrawl(1500));
		}
		catch(Insuffiecient e)
		{
		 e.printStackTrace();
		}
	}
}




















