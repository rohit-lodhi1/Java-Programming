package JavaProgram;

public class SingleTon {
   private static SingleTon val=null;
   private SingleTon() {}
	public static SingleTon getObj()
	{
		if(val==null)
			val=new SingleTon();
		return val;
	}
}
