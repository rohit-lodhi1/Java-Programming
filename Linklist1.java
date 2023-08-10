
class Node{
    private Object data;
    private Node next;

    Node(Object data)
    {
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
    LinkList(LinkList list)
    {
         add(list);
    }

    public Node createNode(Object data){
        Node temp=new Node(data);
        return temp;
    }

    public void add(LinkList list){
        Node temp=list.start;
        while(temp!=null)
        {
            add(temp.getData());
            temp=temp.getNext();
        }
    }

    public  void add(Object data){
       Node temp=createNode(data);
       if(start==null)
        start=temp;
      else
        current.setNext(temp);
      current=temp;
    }

    public void addAtFirst(Object data){
        Node temp=createNode(data);
        if(start==null)
            start=temp;
        else
            temp.setNext(start);
        start=temp;
    }

    public void deleteAtFirst(){
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

     public  void deleteAtNth(int pos){
        Node temp=start,temp1=start;
        int count=1;
        if(temp==null || pos<2)
            deleteAtFirst();
        else
        {
             while(++count<pos && temp.getNext()!=null)
             {
                temp=temp.getNext();
             }
             temp1=temp.getNext();
             temp.setNext(temp1.getNext());
             temp1.setNext(null);
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

        public void addition(LinkList l,LinkList l1,LinkList l3){
            Node temp=l.start,temp1=l1.start;
           //   Node temp3=l.start;
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
                    l3.add(temp.getData());
                 temp=temp.getNext();
                 if(temp1.getNext()!=null)
                    temp1=temp1.getNext();
                else 
                    break;
            }
           /*
            if(temp!=null)
               temp3=temp;
            else if(temp1.getNext()!=null)
                 temp3=temp1;
*/
            while(temp1!=null)
            {
                l3.add((int)(temp1.getData())+carry);
                temp1=temp1.getNext();
            }
        }        
    public void addAtNth(Object data,int pos){
         Node temp=start,temp1=createNode(data);
         int count=1;
         if( temp==null || pos<2)
             addAtFirst(data);
         else
         {
           while( ++count<pos && temp.getNext()!=null)
           {
              temp=temp.getNext();
           }
           temp1.setNext(temp.getNext());
           temp.setNext(temp1);
         }
    }

    public String toString(){
        Node temp=start;
        String s="";
        while(temp!=null)
        {
            s=s+", "+temp.getData();
            temp=temp.getNext();
        }
        return "["+s.substring(2)+"]";
    }
}

class Test{

    public static void main(String[] args) {
        LinkList l3=new LinkList();
        LinkList l=new LinkList();
        l.add(2);
       l.add(3);
  //      l.add(5);
       // l.add(4);
       /* 
        l.addAtFirst(1);
        l.addAtFirst(2);
        l.addAtNth(5,5);
        l.deleteAtFirst();
        l.deleteAtLast();
        l.deleteAtNth(3);*/
        System.out.println(l);
       //l.start=l.reverse(l);
        //System.out.println(l);

        LinkList l1=new LinkList();
        
        l1.add(4);
        l1.add(8);
      //  l1.add(3);
      //  l1.add(6);
        //l2.addAtFirst(8);
        //l2.addAtFirst(9);
        System.out.println(l1);
        // l2.start=l2.reverse(l2);
       // System.out.println(l2);*/
        l3.addition(l,l1,l3);
        l3.start=l3.reverse(l3);
        System.out.println(l3);
        //System.out.println(l2);
    }
}

class Captain{
    String captian;
    public  String toString(){
        return captian;
    }
}




