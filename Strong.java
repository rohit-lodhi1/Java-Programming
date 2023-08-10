class Strong
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

    int n=145,b=2,s=0,t=n,i,r;
     while(n!=0)
     {

      r=n%10;
     s=s+Fact(r);
     n=n/10;

      }
      if(t==s)
         System.out.println("strong"+t);
      else
         System.out.println("not strong"+t);
  
 }
}