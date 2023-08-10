import java.util.*;
class Test{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the string");
		String s=sc.next();
      int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ispre(s,i-1,s.charAt(i))==false)
			{
				 count=countChar(s,i,s.charAt(i));
				 System.out.println(s.charAt(i)+"->"+count);
			}
		}
	}
      public static  Boolean ispre(String s,int ind,char ch){

            
      	for(int i=ind;i>=0;i--)
      	{
      		if(s.charAt(i)==ch)
      		{
      			
      			return true;
      		}
      	}
      	return false;
      	
      }
      public static int countChar(String s,int ind,char ch){
      	
      	int c=0;
      	for(int i=ind;i<s.length();i++)
      	{
      	    if(s.charAt(i)==ch)
      		{
      			c++;
      		}
      	}
      	return c;
      	
      }
}
