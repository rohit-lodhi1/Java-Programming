package ToDoList;
import java.io.Serializable;

public class Task  implements Serializable{
    int id;
    String task,heading,status;
    Task(int id,String heading,String task)
    {
    	this.id=id;
    	this.heading=heading;
    	this.task=task;
    	this.status="NOT DONE";
    }
	public Task(int id2) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean equals(String status)
	{
		return this.status==status;
	}
    
	public String toString()
	{
		return id+"      "+heading+"   "+task+"   "+status+"\n";
	}
}
