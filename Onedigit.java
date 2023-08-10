class Table
{
    public static void onedigit(int n)
    {
            int i,j,k,r,s=0;

            while(n!=0)
       {
            r=n%10;
            n=n/10;
            s=s+r;       
       }
       if(s>9)
        onedigit(s);
    else
       System.out.println(s);
  //      return s;
    }
    public static void main(String[] arg)
    {
        int n=77,i,j,k,r,s=0;
          
      onedigit(n);     
       }
      
 }
