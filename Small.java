import java.util.*;
class Table
{
     public static void main(String[] args)
     {
            Scanner sc=new Scanner(System.in);
            char a[]={'A','B','C','D'};
               int as;
            for(int i=0;i<a.length;i++)
            {
                as=a[i];      
                 if(a[i]>=65 && a[i]<=90)
                    as=as+32;
                   a[i]=(char)as;
            }               
            System.out.println(a);
     }
}