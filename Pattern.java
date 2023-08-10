class Table
{
    public static void main(String[] arg)
    {
        int n=5,i,j,k;
        for(i=1;i<=n;i++)
        {
  
            for(k=n-i;k>=1;k--)
              {
                  System.out.print(" ");     
              }  
           for(j=1;j<=i;j++)
           {
            System.out.print(" *");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
  
            for(k=1;k<=n-i;k++)
              {
                  System.out.print(" ");     
              }  
           for(j=i;j>=1;j--)
           {
            System.out.print(" *");
            }
            System.out.println();
        }
    }
 }
