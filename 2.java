/*class Parent{
	public void m1(){
		System.out.println("parent m1");
	}
	public void m2(){
	     System.out.println("parent m2");
	}
    Parent(){
         super();
    	System.out.println("parent Constructor");
    }
}

class Test extends Parent{

	public static void main(String[] args) {		
            Test t=new Test();
            t.m1();
            t.m2();
	}
    Test(){       
    	System.out.println("Test Constructor");
    }
}*/


class Test{

	public static void main(String[] args) {
		
		String s="1010";
        char bin[]=s.toCharArray();
        int b[]={0,0,0,0};
		for(int i=0;i<=bin.length-1;i++)
		{
			if(bin[i]=='0')
			{
				b[i]=bin[i]-'0';
			}
			else
				b[i]=bin[i]-'1';
		}
		System.out.println(b);
	}
}
