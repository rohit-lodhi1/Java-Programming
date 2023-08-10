import java.util.*;

class NumberConver{

    public int pow(int n,int pw){
   	  int i,p=1;
   	  for(i=1;i<=pw;i++)
   	  {
          p=p*n;
   	  }
   	  return p;
   }
	public  String intTobin(int num){
	    String s="";
	    boolean negative=false;
	    if(num<0)
	    {
	    	negative=true;
	    	num=num*-1;
	    }
		while(num!=0)
		{
	      s=(num%2)+s;
	      num/=2;
		}		
		if(negative==true)
			return onesAndTwos(s);
			return s;
		}
	public String onesAndTwos(String bin){

		String s="00000000000000000000000000000000";
		int carry=1;
		s=s.substring(0,s.length()-bin.length())+bin;
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			 ch[i]=ch[i]=='0'?'1':'0';
			 if(ch[i]=='1' && carry==1)
			 	ch[i]='0';
			 else if(carry==1)
			 {
			 	carry=0;
			 	ch[i]='1';
			 }
		}
		return new String(ch);
	}
	public  String intTooct(int num){

        String s="";
        boolean negative=false;
        if(num<0)
        {
        	negative=true;
        	num=num*-1;
        }
		while(num!=0)
		{
          s=(num%8)+s;
          num/=8;
		}		
	//	if(negative==true)
	//		return onesAndTwos(s);
			return s;
	}
	
	public String intTohexa(int num){
      String s="";
      int r=0;
	  char hexaDigit[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	   while(num!=0){
            r=num%16;
            s=hexaDigit[r]+s;
            num/=16;
	   }
	   return s;
	}
	public int binToint(String bin){

           int c=0;
           int s=0;
           for(int i=bin.length()-1;i>=0;i--)
           {
           	 s=s+(bin.charAt(i)-48)*pow(2,c++);
           }
           return  s;
	}
	public int octToint(String oct){
           int c=oct.length()-1;
           int s=0;
           while(c>=0)
           {
              s=(oct.charAt(c)-'0')*pow(8,(oct.length()-1)-c)+s;
              c--;
           }
           return  s; 
	}
	public int hexaToint(String hex){
	  
	  Test t=new Test();
        int c=0,s=0,x;
         for(int i=hex.length()-1;i>=0;i--)
         {
            if(hex.charAt(i)>='0' && hex.charAt(i)<='9')
            {
                x=hex.charAt(i)-'0';              
            }
            else
            {
                x=(hex.charAt(i))-'A'+10;
            }
            s=s+x*pow(16,c++);
         }
         return s;
      }
   public String binTooct(String bin){

       int l=bin.length();
       String n="";
       for(int i=bin.length()/3;i>0;i--)    
       {
       	 n=binToint(bin.substring(l-3,l))+n;
       	 l-=3;
       }
       if(l>0)
       {
       	  n=binToint(bin.substring(0,l))+n;
       }
       //System.out.println(n);
       return n;
    }
   public String binTohexa(String bin){

          int l=bin.length();
       String n="";
       for(int i=bin.length()/4;i>0;i--)    
       {
       	 n=binToint(bin.substring(l-4,l))+n;
       	 l-=4;
       }
       if(l>0)
       {
       	  n=binToint(bin.substring(0,l))+n;
       }
     //  System.out.println(n);
       return n;
 
    }
   public String octTobin(String oct){

    	int num=octToint(oct);
    	return intTobin(num);
    }
   public String octTohexa(String oct){

    	int num=octToint(oct);
    	return intTohexa(num);
    }
   public String hexaTobin(String hex){

    	int num=hexaToint(hex);
    	return intTobin(num);
    }
   public String hexaTooct(String hex){

    	int num=hexaToint(hex);
    	return intTooct(num);    
    }
}

class Test{

	public static void main(String[] args){		
		NumberConver t=new NumberConver();
		Scanner sc=new Scanner(System.in);
	//	int bin[]={1,0,1,0};

	//	int oct[]={1,4,4};
		 char hexa[]={'0','0','A','B'};
	//	 System.out.println(Integer.toBinaryString(-10));
	//	 System.out.println(t.intTobin(-1));
	//	 System.out.println(t.intTooct(-1));
	//	 System.out.println(t.intTohexa(171));
    //	 System.out.println(t.binToint(bin));
	//	 System.out.println(t.octToint("144"));
		 System.out.println(t.hexaToint("A"));
	//	 System.out.println(t.binTooct("1100100"));
	//   System.out.println(t.binTohexa("11111111"));
	//	 System.out.println(t.octTobin(oct));
	//	 System.out.println(t.octTohexa(oct));
	//	 System.out.println(t.hexaTobin(hexa));
	//	 System.out.println(t.hexaTooct(hexa));
	//   System.out.println();
	}
}