class Test{

        public static int last(String s,int ind) {
        	for(int i=ind ; i<s.length();i++)
        	{
        		if(s.charAt(i)== ' ')
        			return i-1;
        	}

        	return s.length()-1;
        	
        }

       public static Boolean find(String s,int ind,String f) {

       	int i=ind,l=last(s,i),j=0;
		
		if(l-i+1!=f.length())
		  return false;
       	for(i=ind;i<=l;i++)
       	{

          if(s.charAt(i)!=f.charAt(j++))
			return false;
       	}
         return true;
       	
       }


       public static void main(String[] args) {
       		
       		boolean p=true;
       		String s="hello world hi";
            String f="world";
            int fl=0,i; 
             for( i=0;i<s.length();i++)
             {
             	if(i==0 || s.charAt(i-1)==' ')
             	{
             		if(find(s,i,f)==p)
             		{
             			fl=1;
						break;
             		}
             	}
             }
             if(fl==0)
             	System.out.println("Not found "+f);
             else
                 System.out.println("Found " +f);
       	}	
}