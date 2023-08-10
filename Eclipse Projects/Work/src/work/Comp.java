package work;

public class Comp {
	
	String company,gen;
	int ssd,ram;
	Comp(){}
	
	public Comp(String company, String gen, int ssd, int ram) {
		this.company = company;
		this.gen = gen;
		this.ssd = ssd;
		this.ram = ram;
	}
	
	public boolean equals(Object o)
	{
		Comp c;
		if(o instanceof Comp)
		{
			c=(Comp)o;
		  try
		  {
			  return this.company == c.company &&
		  
				this.gen == c.gen &&
				this.ssd == c.ssd &&
				this.ram == c.ram;
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
		return "("+company+","+gen+","+ssd+","+ram+")";
	}

	
}
