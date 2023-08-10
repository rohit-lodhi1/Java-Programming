class Table
{
    public static void main(String[] arg)
    {
       int i,t,t1=0,t2=1,t3=0; 
       for(i=1;i<=100;i++)
       {
           t1=t2;
           t2=t3;
           t3=t1+t2;
           if(t3<=100)
            System.out.print(t3+" ");
           else
              break;
       }       
    }      
}