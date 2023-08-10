abstract class Sample{

    abstract public void m();

    public static void main(String[] args){	
    	System.out.println("Sample Main");
    }
}

class Test extends Sample{

    public void m()
    {
    	System.out.println("HELLO");
    }
	public static void main(String[] args){		
	  Test t=new Test();
	  t.m();
		System.out.println("Main - Test ");           
	}
 	public static void main(int a) {		
		System.out.println("Different Argu"+a);
	}
}