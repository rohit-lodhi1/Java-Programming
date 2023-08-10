package Link;

public class LinkList {
  Node start,current;
  public Node createNode(Object data) {
	  Node temp=new Node(data);
	  return temp;
  }
  
  public void addAtLast(Object data) {
	Node temp=createNode(data);
	if(start==null)
		start=temp;
	else
		current.setNext(temp);
		current=temp;
		temp=null;
   }
  
  public void addAtFirst(Object data){
	  Node temp=createNode(data);
	  temp.setNext(start);
	  start=temp;
  }
  
  public void addAtNthPos(Object data,int pos) {
	  Node temp=createNode(data);
	  Node temp1=start;
	  int posCount=1;
	  while(temp1!=null && ++posCount<pos)
	  {
		  temp1=temp1.getNext();
	  }
	  temp.setNext(temp1.getNext());
	  temp1.setNext(temp);
	  temp1=null;
	  
  }
  

  public Node reverse(Node temp,int grp)
  {
	   Node pre=null,curr=temp,nxt=null;
	   int c=1;
	   while(curr!=null && c++<grp)
	   {
	     nxt=curr.getNext();
	     curr.setNext(pre);
	     pre=curr;
	     curr=nxt;
	   }
	   if(curr!=null)
		   temp.setNext(reverse(curr,grp));
	   return pre;
  }
  
  public String toString()
  {
	  Node temp=start;
	  String s="";
	  while(temp.getNext()!=null)
	  {
		  s=s+", "+temp.getData();
		  temp=temp.getNext();
	  }
	  return s.substring(2);
  }
}
