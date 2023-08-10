package JavaProgram;

public class Computer {
 
	String Compny,process;
	int ram,ssd;
	
	public Computer() {}

	public Computer(String compny, String process, int ram, int ssd) {
		super();
		this.Compny = compny;
		this.process = process;
		this.ram = ram;
		this.ssd = ssd;	
	}
	
	public boolean equals(Object ob) {
		Computer c;
		if(ob instanceof Computer)
		{
			c=(Computer)ob;
		    try { 
	              	return this.Compny==c.Compny &&
	    			this.process==c.process &&
		    		this.ram==c.ram &&
			    	this.ssd==c.ssd;
		        }
		    catch(Exception e)
		    {
		    	return false;
	     	}
		}
		return false;				
	}

	public String toString()
	{	   		
		return "("+Compny+", "+process+", "+ram+", "+ssd+")";
	}
	
}
