package files;
import java.io.File;
public class Rec {
	
	   public static void listPrint(File f) {
		  if(f.isFile())
			  return;
		   
		     String name[]=f.list();
	     try {
		        for(String n:name)
		        {
			        File f1=new File(f,n);
			        System.out.println(n+" -> "+(f1.isFile()?"File":"Folder"));
			       if(!f1.isFile())
			       {
				      System.out.println();
				      listPrint(f1);
			        }
		         }
	          }
	     catch(NullPointerException e)
    	 {  
         }
   }
	
      public static void main(String[] args) {
		File f=new File("C://");
		listPrint(f);		
	 }
}
