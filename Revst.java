import java.util.*;
class Table{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
         System.out.println("Entre the string");
         String str=sc.next();
        
       System.out.println(reverse(str));		
	}

	public static String reverse(String str)
	{
		if(str.length()<=1)
			return str;
		else
			return (reverse(str.substring(1))+ str.charAt(0));
	}
}