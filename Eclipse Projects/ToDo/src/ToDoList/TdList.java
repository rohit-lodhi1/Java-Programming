package ToDoList;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TdList {
    int idCount=0;
    final String path="C:\\abc";
    Scanner sc;
	 Db db = new Db(path+"\\todo.txt");
	 
 	 TdList(){
		 sc = new Scanner(System.in);
	 }
	 
	 public int generateId()
	 {
		 Db db = new Db(path+"\\to_do_ID.txt");
		  Integer i=(Integer)db.get();
		 if(i==null)
		 {
			 //System.out.println(i);
				db.insert(1);
			 return 1;
		 }
		 else {
			int idt=i.intValue()+1;
			db.insert(idt);
			return idt;
		 }	
	 }
	 
	 
	public void add(String heading,String task)
	{
		Task t =new Task(generateId(),heading,task);
		ArrayList al ;
		try {
			al =(ArrayList)db.getAll();
		     al.add(t);
			db.insert(al);
		}
		catch(Exception e)
		{ 
			db.insert(t);
		}
	}
	
	public void showTask()
	{
		System.out.println("NO.    HEADING    TASK     STATUS");
		try {
		  ArrayList al=(ArrayList)db.getAll();
		   System.out.println(al);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println(al.get(1));
	}
	
	public static void main(String[] args) {
		
		TdList td = new TdList();
		td.createMenu();
		
	}


	private void createMenu() {
	    System.out.println("    MENU");
	    System.out.println("1. NEW TASK");
	    System.out.println("2. SHOW ALL TASK");
	    System.out.println("3. UPDATE TASK");
	    System.out.println("4. DELETE TASK");
	    System.out.println("5. SHOW DONE TASK");
	    System.out.println("6. SHOW NOT DONE TASK");
	    System.out.println("7. EXIT");
	   
	    int choice = sc. nextInt();
	    switch(choice)
	    {
	        case 1: 
	        	 newTask();
	        	 break;
	        case 2:
	        	 showTask();
	             break;
	        case 3:
	        	System.out.println("ENTRE THE ID");
	   	     int id = sc.nextInt();
	        	 updateById(id);
	             break;
	        case 4:
	        	 deleteTask();
	             break;
	        case 5:
	        	 showTaskByStatus("DONE");
	             break;
	        case 6:
	        	 showTaskByStatus("NOT DONE");
	             break;
	        case 7:
	        	 System.exit(choice);
	        default:
	        	 System.out.println("WRONG CHOICE");
	    }
	    createMenu();
	    
	}


	private void showTaskByStatus(String status) {
       
		ArrayList al = (ArrayList)db.getAll();
		for(int i=0;i<al.size();i++)
		{
			Task t = (Task)al.get(i);
			if(t.getStatus().equals(status));
			System.out.println("ID "+t.getId()+" HEADING: "+t.getHeading()+" TASK: "+t.getTask()+" STATUS: "+t.getStatus());
		}
		
	}

	private void deleteTask() {
	 
		
	}

	private void updateByHeading()
	{
		System.out.println("ENTRE HEADING OR DESCRIPTION");
		String search = sc.nextLine();
		ArrayList al = (ArrayList)db.getAll();
		for(int i=0;i<al.size();i++)
		{
			Task t = (Task)al.get(i);
			String head = t.getHeading();
			String desc = t.getTask();
			if(head.contains(search) || desc.contains(search))
			{
				updateById(t.getId());
				break;
			}
		}
	}
	

	private void updateById(int id) {
		
	       ArrayList al=(ArrayList)db.get();
	 //      System.out.println(al.get(ind-1));
	       Task t = new Task(id);
	       int index = al.indexOf(t);
	       try {
	    	   t=(Task)al.get(index);
	       t=updateMenu(t);
	       al.set(index,t);
	       db.insert(al);
	       System.out.println("SUCCESSFULLY UPDATED");
	       }catch(Exception e) {
	    	   System.out.println("INVALID ID");
	       }
	       showTask();
	       
	}

  	public Task updateMenu(Task t)
	{
	       
	       System.out.println("1. TASK HEADING");
		    System.out.println("2. TASK DESCRIPTION");
		    System.out.println("3. TASK STATUS");
		    System.out.println("4. BHOOL GYA KYA KRNE AYA THA");
	       int choice=sc.nextInt();
	       sc.nextLine(); 
	       switch(choice)
	       {
	         case 2:
	                System.out.println("ENTRE THE TASK");
	                t.setTask(sc.nextLine());
                 break;
	         case 1:
		             System.out.println("ENTRE THE HEADING");
		             t.setHeading(sc.nextLine());
		             break;
	         case 3:
		             System.out.println("ENTRE THE STATUS");
		             t.setStatus(sc.nextLine());
		             break;
	         default:
	    	   System.out.println("SOMETHING WENT WRONG TRY AGAIN!!!!!");
	       }		
	       return t;
	}

	public void newTask() {
		System.out.println("ENTRE THE HEADING");
		sc.nextLine();
	    String head=sc.nextLine();
	    System.out.println("ENTRE THE TASK");
	    String task = sc.nextLine();
	      add(head,task);
	}

}
