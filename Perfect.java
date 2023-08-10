class Table
{
    public static void main(String[] arg)
    {
        int n=28,i,j=0,k=n;
        for(i=1;i<=n/2;i++)
        {
              if(n%i==0)
              {
                    j=j+i;               
              }
        }
        if(j==k)
        System.out.println("perfect"+k);
         else
            System.out.println("Not perfect"+k);
    }
 }
