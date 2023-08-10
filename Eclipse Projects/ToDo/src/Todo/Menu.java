package Todo;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	
      public static void viewMenu()throws Exception{
    	  System.out.println("      MENU");
      	  System.out.println(" 1. NEW TASK");
      	  System.out.println(" 2. SHOW TASK");
      	  System.out.println(" 3. EXIT");
          
    	  int ch;
    	  Db db=new Db("C:\\abc\\list.txt");
    	  System.out.println("Entre Your Choice");
    	  Scanner sc=new Scanner(System.in);
    	  ch=sc.nextInt();
    	  ArrayList al = new ArrayList();
    	  if(ch>3 && ch<1)
    		  viewMenu();
    	  switch(ch)
    	  {
    	      case 1:
    	      {
    	    	db.addTask();
    	    		break;
    	      }
    	      case 2:{
    	    	  ShowTask st = new ShowTask();
    	    	    st.view();
    	    	    break;
    	      }
    	      case 3:{
    	    	  System.exit(ch);
    	    	  break;
    	      }
    	      default :{
    	    	  System.out.println("Entre Again");
    	      }
    	  }
    	  viewMenu();  
      }
}

