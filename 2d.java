import java.util.*;

class Test{

public void sum(int a[][]) {
    Scanner sc=new Scanner(System.in);
     for(int i=0;i<a.length;i++)
           {
            for(int j=0;j<a[1].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
           }
      int sum=0;
           for(int i=0;i<a[0].length;i++)
           {
            sum=0;
             for(int j=0;j<a.length;j++)
             {
                 sum+=a[j][i];
             }
             System.out.println("The sum ="+sum);
           }

           for(int i=0;i<a.length;i++)
           {
            for(int j=0;j<a[1].length;j++)
            {
               System.out.print(a[i][j]);
            }
            System.out.println("");
           }
}
	public static void main(String[] args) {		
		int a[][]={{1,2,3},{4,5,9}};
        //new int[2][3];
   Test t=new Test();
 //  t.sum(a);         
   t.large(a);
//   System.out.println(a.length);
 //  System.out.println(a[0].length);
 //  System.out.println(a[0][1]);
	}
    public static void large(int a[][]) {
int max=a[0][0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]>max)
                    max=a[i][j];
            }
             System.out.println(max);
        }
        
    }
}