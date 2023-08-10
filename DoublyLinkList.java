class Node{
	private Object data;
	private Node next;
    private Node prev;
   Node(Object data){
   	this.data=data;
   	this.next=null;
    this.prev=null;

   }
	public void setData(Object data){
         this.data=data;
	}
	public void setNext(Node next){
		this.next=next;
	}
    public void setPrev(Node prev)
    {
        this.prev=prev;
    }
	public Object getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
	}
    public Node getPrev()
    {
        return prev;
    }

}

class LinkList{

   Node start,current;

   LinkList(){}
   LinkList(LinkList list){
   	add(list);
   }
   public Node createNode(Object data)
   {
       Node temp=new Node(data);
       return temp;
   }

   public void add(Object data)
   {
      Node temp=new Node(data);
      if(start==null)
        start=temp;
       else
         current->next=temp;
     current=temp;
   }


	public String toString(){
		Node temp=start;
		String s=" ";
		while(temp!=null)
		{
			s=s+", " +temp.getData();
			temp=temp.getNext();
		}
		return "["+s.substring(2)+"]";
	}
}


class Test{
	public static void main(String[] args) {
		
		LinkList l=new LinkList();
		l.add(1);
		l.add(2);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		//l.addAtNth(100,17);
   //Captain cap=new Captain();

/* l.add(cap.captian="ROhit");
        l.add(cap.captian="sumit");
        l.add(cap.captian="devendra");
        l.add(cap.captian="price");

        l.add(cap.captian="op");
        l.add(cap.captian="kama;");
        l.add(cap.captian="ROhit");
        l.add(cap.captian="ROhit");*/


		//l.deleteAtFirst();
	//	l.deleteAtLast();
  //   l.deleteAtNth(19) ;
	/*LinkList l1=new LinkList(l);
		l1.addAtFirst(100);
		l1.addAtFirst(200);
		l1.addAtFirst(300);
		l1.addAtFirst(400);
		l1.addAtFirst(500);
		l1.addAtFirst(600);
	*/	//l1=l;
//	System.out.println(l);
	System.out.println(l);

	}
}

class Captain{
    String captian;
    public  String toString(){
        return captian;
    }
}
