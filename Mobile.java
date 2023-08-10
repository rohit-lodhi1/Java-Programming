import java.util.*;
class Table{

          public static void main(String[] args){
                
             Scanner sc=new Scanner(System.in);
             System.out.println("Entre the mobile no");
             String s=sc.next();
             int f=0;
             for(int i=0;i<s.length();i++)
             {
             	
             	if(!(s.charAt(i)>=48 && s.charAt(i)<=57))
             	{
             	    f=1;
             		System.out.println("Not valid");
             		break;
             	}
             	else
             	if(s.length()<10 || s.length()>10)
             	{
             		f=1;
             		System.out.println("Not valid");
             		break;
             	}
                                 	
             	
             }
             if(f==0)
             	System.out.println("welcome"+s);

          }

}