package files;
import java.io.*;

/*     // File Reading and Writing 

class Test{
	public static void main(String[] args)throws IOException {
		
		File f2=new File("C:\\abc\\xyz.txt");
		
		
		FileWriter f3=new FileWriter(f2);
	   String s="HELLO THIS IS ALRIGHT";
		f3.write(s);
		f3.close();
		  				
	FileReader f1=new FileReader("C:\\abc\\xyz.txt");
		int i=0;
		while((i=f1.read())!=-1)
		System.out.print((char)i);
		f3.close();
	}
}

*/

/*
public class Test {

	public static void main(String[] args)throws Exception {		
		File f1=new File("C:\\TurboC++");
		if(f1.exists())
		{
			String name[]=f1.list();
			for(String n:name)		
			{
				 File f=new File(f1,n);
			 System.out.println(n+"  ->"+(f.isFile()?"File":"FOlder"));
			 if(!(f.isFile()))
			 {					
				 String name1[]=f.list();
					for(String n1:name1)		
					{					
						 File f2=new File(f,n1);
					 System.out.println(n1+"  ->"+(f2.isFile()?"File":"FOlder"));
					}			
			 }
			 System.out.println();
			}
			System.out.print(f1.getName());
		}				
	}
}
*/
/*
import java.util.Scanner;
public class Test{
	
	public static void main(String[] args)throws Exception {
		File f=new File("c://abc");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		File f1=new File(f,s);
	
		System.out.println(s);
	
	}
} */
/*

public class Test{
	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("C:\\abc\\xyz.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		String s="\n THIS IS DOLLOP";
		bw.write(s);
		bw.close();
		
	}
}

*/














