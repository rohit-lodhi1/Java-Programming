class Test{

    public int pow(int n,int pw){

        int i,p=1;
        for(i=1;i<=pw;i++)
        {
            p=p*n;
        }
        return p;

    }

     public void hexaTobin(char hex[]){
 
       Test t=new Test();
        int c=0,s=0,x;
         for(int i=hex.length-1;i>=0;i--)
         {
            if(hex[i]>='0' && hex[i]<='9')
            {
                x=hex[i]-'0';
                c++;
            }
            else
            {
                x=hex[i]-'A'+10;
            }
            s=s+x*pow(16,c);
         }
         t.intTobin(s);

     }

    public void hexaTooct(char hex[]){
        Test t=new Test();
        int c=0,s=0,x;
         for(int i=hex.length-1;i>=0;i--)
         {
            if(hex[i]>='0' && hex[i]<='9')
            {
                x=hex[i]-'0';
                c++;
            }
            else
            {
                x=hex[i]-'A'+10;
            }
            s=s+x*pow(16,c);
         }
         t.intTooct(s);

    }

      public void octTobin(int oct[]){
         
         Test t=new Test();
         int c=7,s=0,r;
         while(c>=0)
         {
             //r=
             s=s+oct[c]*pow(8,7-c);
             c--;

         }
         t.intTobin(s);
           
      }

      public void octTohexa(int oct[]){
               
        Test t=new Test();
            int c=7,s=0,r;
         while(c>=0)
         {
             //r=
             s=s+oct[c]*pow(8,7-c);
             c--;

         }
         t.intTohexa(s);


      }
     public void binTohexa(int bin[]){

        Test t=new Test();
        int c=15,s=0;
         while(c>=0)
         {
             //r=
             s=s+bin[c]*pow(2,15-c);
             c--;

         }
     t.intTohexa(s);

     }

    public void binTooct(int bin[]){

      Test t=new Test();
      int c=15,s=0;
         while(c>=0)
         {
             //r=
             s=s+bin[c]*pow(2,15-c);
             c--;

         }

         t.intTooct(s);
    }
     
     public void hexaToint(char hex[])
     {
        
         int c=0,s=0,x;
         for(int i=hex.length-1;i>=0;i--)
         {
            if(hex[i]>='0' && hex[i]<='9')
            {
                x=hex[i]-'0';
                c++;
            }
            else
            {
                x=hex[i]-'A'+10;
            }
            s=s+x*pow(16,c);

         }
        System.out.println(s);
     }
     public void octToint(int oct[])
    {
         int c=7,s=0,r;
         while(c>=0)
         {
             //r=
             s=s+oct[c]*pow(8,7-c);
             c--;

         }
         System.out.println(s);
    }

    public void binToint(int bin[])
    {
         int c=15,s=0,r;
         while(c>=0)
         {
             //r=
             s=s+bin[c]*pow(2,15-c);
             c--;

         }
         System.out.println(s);
    }


    public void intTohexa(int n){

        char h[]={0,0,0,0};
         char hexaDigit[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int c=3,r;
        while(c>=0)
        {
            r=n%16;
            h[c--]=hexaDigit[r];
            n=n/16;
        }
        c=0;
        while(c<=3)
        {
            System.out.print(h[c++]+" ");
        }
      }
     public void intTooct(int n){

        int b[]={0,0,0,0,0,0,0,0};
        int c=7,r;
        while(c>=0)
        {
            r=n%8;
            b[c--]=r;
            n=n/8;
        }
        c=0;
        while(c<=7)
        {
            System.out.print(b[c++]+" ");
        }
      }

      public void intTobin(int n){

        int b[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int c=15,r;
        while(c>=0)
        {
            r=n%2;
            b[c--]=r;
            n=n/2;
        }
        c=0;
        while(c<=15)
        {
            System.out.print(b[c++]+" ");
        }
      }
      //Test t=new Test();
    public static void main(String[] args) {
        
        Test t=new Test();
        int n=1000;
        int bin[]={0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0};
        int oct[]={0,0,0,0,0,0,7,3};
        char  hex[]={'0','0','3','B'};
    //    t.intTobin(n);
    //    t.intTooct(n);
        //t.intTohexa(n);
     //   t.binToint(bin);
     //   t.octToint(oct);
 //       t.hexaToint(hex);
    //    t.binTooct(bin);
     //   t.binTohexa(bin);
    //    t.octTohexa(oct);
     //     t.octTobin(oct);    
      //    t.hexaTooct(hex);
      //  t.hexaTobin(hex);
    }
}