class Table
{
    public static void main(String[] arg)
    {
        int n=5,i,j,k;
        for(i=0;i<n;i++)
        {
  
           for(j=0;j<n;j++)
           {
                if(i==0||j==0||i<=n-1&&j==n-1 ||i==n/2)
                  System.out.print("*");
                 else
                     System.out.print(" ");
            }
            System.out.println();
        }
    }
 }
