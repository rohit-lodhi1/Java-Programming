package JavaProgram;

public class Wrapper {

	public static void main(String[] args) {
		String s="10";
		int a=10;
		a=Integer.parseInt(s);               //    String     ->  Premitive
		s=Integer.toString(a);               //    Premitive  ->  String
		Integer i = Integer.valueOf(10);     //    Premitive  ->  Wrapper
		Integer j = Integer.valueOf(s);      //    String     ->  Wrapper
	//	j=i.intValue();                      //    Wrapper    ->  Premitive
		s=i.toString();                      //    Wrapper    ->  String
		s.split(",");
	    System.out.println(j+10);
	}
	
}
