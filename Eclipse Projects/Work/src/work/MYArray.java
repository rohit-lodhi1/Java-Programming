package work;

public class MYArray {

	private int size=-1,capacity=0;
	 Object values[];
	 private boolean unique=true; 
	MYArray(){
		capacity=5;
		values=new Object[capacity];
		
	}
	
	MYArray(int capacity)
	{
		this.capacity=capacity;
		values=new Object[capacity];
	}
	
	MYArray(boolean unique)
	{
		this();
		this.unique=unique;
	}
	
	MYArray(Comp ob)
	{
		this();
		add(ob);
	}
	
   MYArray(MYArray ob)
   {
	   this();
	   for(int i=0;i<=ob.size;i++)
	   {
	   add(ob.valueOf(i));
	   }
   }
	
   MYArray(int capacity,boolean unique)
   {
	   this();
	   this.unique=unique;
	   
   }
   
	MYArray(MYArray al, boolean unique) {
	   this();
		this.unique=unique;
		for(int i=0;i<=al.size;i++)
		   {
		   add(al.valueOf(i));
		   }
   }

	private void growArray() {
		capacity+=5;
		Object ob[]=new Object[capacity];
		copy(ob,values);
		values=ob;
		
	}
	
	private void copy(Object des[], Object[] src) {
		for(int i=0;i<src.length;i++)
		{
			des[i]=src[i];
		}		
	}

	public void add(Object value) {

	    if(size+1==capacity)
	    {
	    	growArray();
	    }
	if(unique==true)
	{
		values[++size]=value;
	}
	    else if(indexOf(value)==-1)
	    {
	    	values[++size]=value;
	    }
		
	}
	
	public void reverse()
	{
		int st=0,la=size;
		Object t;
		while(st<la)
		{
			t=values[st];
			values[st]=values[la];
			values[la]=t;
			st++;
			la--;
		}
	}

	
	
	public String toString()
	{
		String s="";
		for(int i=0;i<=size;i++)
		    s=s+", "+values[i];
		return "["+s.substring(2)+"]";
	}

	public int indexOf(Object value) {
	   for(int i=0;i<=size;i++)
	   {
		   if(value.equals(values[i]))
			   return i;
	   }
		return -1;
	}
	
	public Object valueOf(int ind) {
		if(ind>=0 && ind<=size)
			  return values[ind];
		return null;
	}	
}
