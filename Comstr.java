import java.util.*;
class Table
{
    public static void main(String[] arg)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("plz entre 2 integer");

        String s=sc.next();
        String s1=sc.next();
       // if(a>b)
           if(s.compareTo(s1)==0)        
            System.out.println("Found"+s);
        else
            System.out.println("Not found");
              
        
           // System.out.println("max :"+b);
               
    }
 }