package JavaProgram;

public class MyArrayList {
	private int size=-1,capacity=0;
	 Object values[];
	private boolean unique=true;
	
	MyArrayList()
	{		
       capacity=5;		
       values=new Object[capacity];
	}
	
	MyArrayList(int capacity)
	{
		this.capacity=capacity;
		 values=new Object[capacity];
	}

	public MyArrayList(boolean unique) {
		this();
		this.unique=unique;
	}
	
	public MyArrayList(int capacity, boolean unique) {
		this(capacity);
		this.unique=unique;
	}
	
	public MyArrayList(Computer ob) {
		this();
		add(ob);
	}
	
	public MyArrayList(MyArrayList al) {
		this();
		for(int i=0;i<=al.size;i++)
		{
		     add(al.valueOf(i));
		}
	}
	
	public MyArrayList(MyArrayList al, boolean unique) {
		this();
		this.unique=unique;
		for(int i=0;i<=al.size;i++)
		{
		     add(al.valueOf(i));
		}
	}
	
	public void growArray(){
		capacity=capacity*3/2+1;
	   Object ob[]=new Object[capacity];
	   copy(ob,values);
	   values=ob;		
	}
	
	public void copy(Object des[],Object src[]){
		for(int i=0;i<src.length;i++)
			
			des[i]=src[i];
		
	}
	
	public void addAtFirst(Object value)
	{
		reverse();
		add(value);
		reverse();
	}
	
	
	public void add(Object value) {
		if(size+1==capacity)
			
			growArray();		
		
		if(unique==true)
		{
			size++;
			values[size]=value;
		}
		else if(indexOf(value)==-1)
		{
			size++;
			values[size]=value;
		}					
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<=size;i++)
		{
			s=s+", "+values[i];
		}
		return "["+s.substring(2)+"]";
	}
	
	public void reverse() {
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
	
	public void groupReverse(int st,int la)
	{
		Object t;
		if(la>size)
			la=size;
		
		while(st<la)
		{
		  t=values[st];
		  values[st]=values[la];
		  values[la]=t;
		  st++;
		  la--;
		}
	}
	
	public void groupReverse(int group)
	{
		for(int i=0;i<=size;i+=group)
		{
		   groupReverse(i,i+group-1); 	
		}
	}
	
	public Object valueOf(int i) {
	    if(!(i>=0 && i<=size))
	    	return null;
		return values[i];
	}
	
	public int indexOf(Object val) {
		for(int i=0;i<=size;i++)
		{
		   if(val.equals(values[i]))
			   return i;
		}
		return -1;	
	}
	
	public int size()
	{
		return size;
	}
	
	public int capacity()
	{
		return capacity;
	}
	
}