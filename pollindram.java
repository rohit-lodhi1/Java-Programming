import java.util.*;
class Table
{
     public static void main(String[] args)
     {
            Scanner sc=new Scanner(System.in);
            System.out.println("entre the string");
            String s=sc.next();
           
           int l=s.length()-1;
           int f=0;
           int st=0;
           while(st<l)
           {
              if(s.charAt(st)!=s.charAt(l))
              {
               f=1;
                  System.out.println("not");
                break;
              }
              st++;
              l--;
            
           }
           if(f==0)
                System.out.println("yes");
            
            

                
     }

}