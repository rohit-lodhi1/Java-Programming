import java.util.*;
class Table
{
     public static void main(String[] args)
     {
            Scanner sc=new Scanner(System.in);
            System.out.println("entre the string");
            String s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                     
              if(s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i' || s.charAt(i)=='a' || s.charAt(i)=='e')      
                 System.out.println(s.charAt(i));

            }

                
     }

}