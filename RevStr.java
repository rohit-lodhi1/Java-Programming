import java.util.*;
class Table{

	 public static void main(String[] args){

	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Entre the string");
	 	String s=sc.next();
	 	System.out.println("Entre the Word to Find");
	 	String s1=sc.next();
	 	int f=0;
	 	char ch;
	 	for(int i=0;i<s.length();i++)
	 	{
         
              if(!(s.charAt(i)==s1.charAt(i)))
              {
              	f=1;
              }	 	

	    }
	    if(f==0)
	    	System.out.println("Found");
	    else
	    	System.out.println("not Found");
	 }
}