import java.util.*;
class Table
{
     public static void main(String[] args)
     {
            Scanner sc=new Scanner(System.in);
            char a[]={'a','b','c','d'};
               int as;
            for(int i=0;i<a.length;i++)
            {
                as=a[i];      
                 if(a[i]>=97 && a[i]<=122)
                    as=as-32;
                   a[i]=(char)as;
            }               
            System.out.println(a);
     }
}