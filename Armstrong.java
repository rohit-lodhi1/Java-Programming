class Strong
{
    public static int Pow(int n,int pw)
    {
           int i,p=1;
           for(i=1;i<=pw;i++)
           {
                 p=n*p;
         //       s=s+b;

           }
           
           return p;    
    }
    public static int Count(int n)
    {
        int c=0;
        while(n!=0)
        {
              c++;         
            n=n/10;
        }
        return c;
    }
    public static void main(String [] args){

    int n=153,s=0,t=n,c=Count(n),r;
     while(n!=0)
     {

      r=n%10;
     s=s+Pow(r,c);
     n=n/10;

      }
      if(t==s)
         System.out.println("strong"+t);
      else
         System.out.println("not strong"+t);
  
 }
}