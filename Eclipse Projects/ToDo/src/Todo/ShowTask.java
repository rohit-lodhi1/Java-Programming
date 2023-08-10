package Todo;
import java.util.*;
public class ShowTask {
	
	public static void view()throws Exception
	{
		Db db=new Db("C:\\abc\\list.txt");
		ArrayList al=(ArrayList)db.readObj();
		//Object a[]=al;
		Task t;
		int i=0;
		
		for(i=0;i<al.size();i++)
		{
			
		 ArrayList a=(ArrayList)al.get(i);
	     	t=(Task)a.get(0);
		System.out.println("ID :- "+t.id);
		System.out.println("TASK :- "+t.task);
		System.out.println("STATUS :- "+t.status);
		}
	}
	
}
