package Todo;
import java.io. Serializable;
public class Task implements Serializable {
    static int count=0;
	int id;
	String task,status;
	
	Task(String task)
	{
		this.task=task;
		this.status="DUE";
		this.id=++count;
	}
/*	
	public String toString()
	{
		return "ID - "+id+" Task -"+task+" Status -"+status;	
	}  */  
}
