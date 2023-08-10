class Node{
	private Object data;
	private Node next;

   Node(Object data){
   	this.data=data;
   	this.next=null;
   }
	public void setData(Object data){
         this.data=data;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Object getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
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

   public void add(LinkList list)
   {
   	  Node temp=list.start;
   	  while(temp!=null)
   	  {
   	  	add(temp.getData());
   	  	temp=temp.getNext();
   	  }
   }

	public void add(Object data){
		Node temp=createNode(data);
		if(start==null)
			start=temp;
		else
			current.setNext(temp);
		current=temp;
	}

    public void deleteAtFirst()
    {
    	Node temp=start;
    	start=temp.getNext();
    	temp.setNext(null);
    }

    public void deleteAtLast(){
    	Node temp=start;
    	while(temp.getNext().getNext()!=null)
    	{
    		temp=temp.getNext();
    	}
    	temp.setNext(null);
    }

    public void deleteAtNth(int pos){
    	Node temp=start;
    	Node temp1=start;
    	int count=1;
    	if(temp==null || pos<2)
    	{
    		deleteAtFirst();
    	}
    	else{
    	while(++count<pos && temp.getNext()!=null)
    	{
         temp=temp.getNext();
    	}
    	 if(temp.getNext()==null)
    	 {
    	 	deleteAtLast();
    	 }
    	   else{
    	      temp1=temp.getNext();
         	temp.setNext(temp1.getNext());
         	temp1.setNext(null);
         }
    }
    }

 public void addition(LinkList l,LinkList l1,LinkList l3){
            Node temp=l.start,temp1=l1.start;
            temp=l.reverse(l);
            temp1=l1.reverse(l1);
            int value=0,carry=0;
            while(temp!=null)
            {
                value=0;
                if(temp1!=null)
                {
                    value=(int)(temp.getData())+(int)(temp1.getData())+carry;
                    carry=0;
                    carry=value/10;
                    value=value%10;
                    l3.add(value);
                }
                else
                l3.add(value);
                temp=temp.getNext();
                if(temp1.getNext()!=null)
                temp1=temp1.getNext();
                else
                    break;
            }
            while(temp!=null)
            {
                l3.add(temp.getData());
                temp=temp.getNext();
            }
        }

        
        public  Node reverse(LinkList l){
            Node pre=null,curr=l.start,nxt=null;
               current=l.start;
            while(curr!=null)
            {
                nxt=curr.getNext();
                curr.setNext(pre);
                pre=curr;
                curr=nxt;
            }         
            return pre;
        }

    public void addAtNth(Object data,int pos){
    	Node temp1=createNode(data);
    	Node temp=start;
    	int count=1;
    	if(start==null || pos<2)
    	{
    		addAtFirst(data);
    	}
    	else{
    	while(++count<pos && temp.getNext()!=null)
    	{         	
          temp=temp.getNext();
    	}
        	temp1.setNext(temp.getNext());
       	temp.setNext(temp1);
      }
    }

	public void addAtFirst(Object data){
          
         Node temp=createNode(data);
         temp.setData(data);
         if(start==null)
         	start=temp;
         else
         {
         	temp.setNext(start);
         	start=temp;
         }
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
		l.addAtNth(100,17);
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

        public void addition(LinkList l,LinkList l1,LinkList l3){
            Node temp=l.start,temp1=l1.start;
            temp=l.reverse(l);
            temp1=l1.reverse(l1);
            int value=0,carry=0;
            while(temp!=null)
            {
                value=0;
                if(temp1!=null)
                {
                    value=(int)(temp.getData())+(int)(temp1.getData())+carry;
                    carry=0;
                    carry=value/10;
                    value=value%10;
                    l3.add(value);
                }
                else
                l3.add(value);            
                temp=temp.getNext();
                if(temp1.getNext()!=null)
                temp1=temp1.getNext();
                else
                    break;
            }
            while(temp!=null)
            {
                l3.add(temp.getData());
                temp=temp.getNext();
            }
        }
