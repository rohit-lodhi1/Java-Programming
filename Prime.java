class Prime
{
    public static int Fact(int n)
    {
           int i,b=1,s=0,t=n;
           for(i=1;i<=n;i++)
           {
                b=i*b;
         //       s=s+b;

           }
           
           return b;    
    }
    public static void main(String [] args){
    int n=153,b=2,s=0,t=n,i;
     while(n!=0)
     {

      n=n%10;
     s=s+fact(n);
     n=n/10;

      }
      if(t==s)
         System.out.println("strong"+s);
      else
         System.out.println("not strong"+s);
  
 }
}