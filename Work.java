/*class Captain{
    String name;
    String suit;
    String power;
    Captain(String name,String suit,String power)
    {
         this.name=name;
         this.suit=suit;
         this.power=power;
    }
}

class Avenger extends Captain{
    String name;
    String power;
    String suit;
    Avenger()
    {
         this.name=name;
         this.suit=suit;
         this.power=power;   
    }
}

class Fight extends Avenger{

    public static void main(String[] args) {
         
         Fight team=new Fight()
         Captain team=new Captain();
    }
}
*/
class Sample{

static void m1 (int...a) { 
    System.out.print ("int...");
}

static void ml (int a,Object ref) {
 System.out.print ("Integer");

}

/*static void m1 (Object ref) {
 System.out.print ("object");
}*/

static void mi (long ref) {
 System.out.print ("long");
}
public static void main(String[] args) {
byte b=1;
 m1 (b,10);
 m1(10,20,30);
}
}

/*class Jcp313

public static void main(String[] args) (

new Jep313().m1();

public void mi () (

null.m2():

1

public static void m2(†

System.out.println("Hat");




*/


/*class Node{
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
            temp=l.reverse(l);
            temp1=l1.reverse(l1);
            int value=0,carry=0;
            while(temp!=null)
            {
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
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
       /* 
        l.addAtFirst(1);
        l.addAtFirst(2);
        l.addAtNth(5,5);
        l.deleteAtFirst();
        l.deleteAtLast();
        l.deleteAtNth(3);
        System.out.println(l);
       //l.start=l.reverse(l);
        //System.out.println(l);

        LinkList l1=new LinkList();
        
        l1.add(1);
        l1.add(2);
  //      l1.add(3);
        l1.add(6);
        //l2.addAtFirst(8);
        //l2.addAtFirst(9);
        System.out.println(l1);
        // l2.start=l2.reverse(l2);
       // System.out.println(l2);
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
*/



/*class Test{

     public static void reverse(int a[],int st,int g){       
       int t,s=st,l=g-1;       
     	while(s<l)
     	{
     		t=a[s];
     		a[s]=a[l];
     		a[l]=t;
     		s++;
     		l--;
     	}
     }

     public static void rev(int a[],int g){
          int l=a.length;
        for(int i=0;i<a.length;i++)
        {
        	if(i==0 || i%g==0 && l>=g+i)
        	reverse(a,i,g+i);
        }     	
     }
 
	public static void main(String[] args){
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int g=4;
		rev(a,g);
		for(int i:a)
		System.out.print(i+" ");
	}
}*/


/*
class Test{

    public static void find(int a[]) {

    	for(int i=0;i<a.length;i++)    	
    	{
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]==a[j])
    				System.out.print(a[i]+" ");
    		}
    	}
    }
    public static void main(String[] args) {
    	
    	int a[]={1,2,3,4,5,1,2};
    	find(a);
    }
}


*/


/*
class Test{

    public static void find(int a[]) {
           
           int m=a[0];
    	for(int i=0;i<a.length;i++)    	
    	{
    		if(a[i]>m)
    		{
    			m=a[i];
    		}
    	}
    	System.out.println(m);
    }
    public static void main(String[] args) {
    	
    	int a[]={1,2,3,4,5,1,2,9};
    	find(a);
    }
}

*/
/*class Test{

     public static void reverse(int a[],int st,int g){       
       int t,s=st,l=g-1;       
     	while(s<l)
     	{
     		t=a[s];
     		a[s]=a[l];
     		a[l]=t;
     		s++;
     		l--;
     	}
     }

     public static void rev(int a[],int g){
          int l=a.length;
        for(int i=0;i<a.length;i++)
        {
        	if(i==0 || i%g==0 && l>=g+i)
        	reverse(a,i,g+i);
        }     	
     }
 
	public static void main(String[] args){
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int g=4;
		rev(a,g);
		for(int i:a)
		System.out.print(i+" ");
	}
}*/


/*
class Test{

    public static void find(int a[]) {

    	for(int i=0;i<a.length;i++)    	
    	{
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]==a[j])
    				System.out.print(a[i]+" ");
    		}
    	}
    }
    public static void main(String[] args) {
    	
    	int a[]={1,2,3,4,5,1,2};
    	find(a);
    }
}


*/

/*

class Test{

    public static void find(int a[]) {
           
           int m=a[0],m1=0;
    	for(int i=0;i<a.length;i++)    	
    	{
    		if(a[i]>m)
    		{
    			m1=m;
    			m=a[i];
    		}
    		 if(a[i]<m1)
    		{
                m1=a[i];
    		}
    	}
    	System.out.println(m+" "+m1);
    }
    public static void main(String[] args) {
    	
    	int a[]={1,2,3,4,5,5,1,2,0};
    	find(a);
    }
}

*/


/*
class Test{

    public static void find(int a[]) {
           
           int m=a[0],m1=a[1],j=0;
           while(m==m1)
           	m1=a[m+j++];
    	for(int i=0;i<a.length;i++)    	
    	{
    		if(a[i]<m)
    		{
    			m1=m;
    			m=a[i];
    		}
    	//	 if(a[i]<m1)
    	//	{
          //      m1=a[i];
    	//	}
    	}
    	System.out.println(m+" "+m1);
    }
    public static void main(String[] args) {
    	
    	int a[]={0,0,0,2,3,4,5,5};
    	find(a);
    }
}
*/
/*
class Test{

    public static void find(int a[]) {
           
           int m=a[0],m1=a[1],j=0;
           while(m==m1)
           	m1=a[m+j++];
    	for(int i=0;i<a.length;i++)    	
    	{
    		if(a[i]<m)
    		{
    			m1=m;
    			m=a[i];
    		}
    	//	 if(a[i]<m1)
    	//	{
          //      m1=a[i];
    	//	}
    	}
    	System.out.println(m+" "+m1);
    }
    public static void main(String[] args) {    	
    	int a[]={0,0,0,2,3,4,5,5};
    	find(a);
    }
}
*/
/*
class Test{

    public static void find(int a[],int b[]) {
           
    	for(int i=0;i<a.length;i++)    	
    	{
    		a[i]=a[i]+b[i];
    	}
    	
    }
    public static void main(String[] args) {
    	
    	int a[]={1,2,3,2,3,4,5,6};
    	int b[]={1,2,3,0,0,0,0,0};
    	find(a,b);
    	for(int i:a)
    		System.out.print(i);
    }
}
*/

/*
class Test{

public static int count(char a[],int ind,char ch) {
int c=0;
    for(int i=0;i<a.length;i++)
    {
        if(ch==a[i])
            c++;

    }
return c;    
}

    public boolean find(char a[],int ind,char ch){
    	
        for(int i=ind;i>=0;i--)
        {
             if(a[i]==ch)
             {
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args) {
    	Test t=new Test();
        int c;
        String s="hello world";
    	char a[]=

        for(int i=0;i<a.length;i++)
        {
            if(t.find(a,i-1,a[i])==false)
            {
                c=count(a,i,a[i]);
                System.out.print(a[i]+"->"+c+"\n");
            }
        }
    	
    }
}

*/

/*class Test{

   public static String fun(String sign) {
    
    String half=sign.substring(sign.length()/2-1,sign.length()/2+2);
    return half;
       
   }
    public static void main(String[] args) {
        
        int a[]=new int[4];
        String s="1234";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)        
        {
            a[i]=(int)(c[i]-48);
        }
        for(int i:a)
         System.out.print(i+" ");
        
    }
}
*/
/*
import java.util.*;
class Account{

    private String name,mobile;
    private int acc,accountBalance=0;

    Account(String name,String mobile,int acc)
    {
        this.name=name;
        this.mobile=mobile;
        this.acc=acc;
    }

    public  boolean matchAcc(int acc)
    {
        return this.acc==acc;
    }
    public boolean matchMobile(String mobile)
    {
        return this.mobile.equals(mobile);
    }
    public String toString()
    {
        return "NAME :- "+name+" "+"MOBILE NO :-"+mobile+" "+"ACCOUNT NO :-"+acc;
    }
}


class LenaDenaBank{

 Account account[];
 int totalAcc=0;
LenaDenaBank()
{
    account=new Account[5];
}

public boolean isAccount(int acc)
{
    for(int i=0;i<totalAcc;i++)
    {
    if(account[i].matchAcc(acc))
        return true;
   }
    return false;
}

public boolean isMobile(String mobile)
{
    for(int i=0;i<totalAcc;i++)
    {
    if(account[i].matchMobile(mobile))
        return true;
   }
    return false;
}
    public void createAcc(String name,String mobile,int acc){
            
            Account ac=new Account(name,mobile,acc);
        if(isAccount(acc))
        {
            System.out.println("ALREADY EXISTS"+acc);
        }
        else if(isMobile(mobile))
        {
            System.out.println("ALREADY EXISTS"+mobile);
        }
        else
        {
            account[totalAcc++]=ac;
        }
    }
    public void viewAcc()
    {
        for(int i=0;i<totalAcc;i++)
        {
            System.out.println(account[i]);
        }
    }
}

class Test{

    public static void main(String[] args) {
        LenaDenaBank ldk=new LenaDenaBank();
        Scanner sc=new Scanner(System.in);
        int i=0;
        int acc=100;
        while( i<2)
        {
        System.out.println("ENTER YOUR NAME");
        String name=sc.nextLine();
        System.out.println("ENTER YOUR MOBILE");
        String mobile=sc.nextLine();
        //System.out.println("ENTER YOUR NAME");
        
i++;
        ldk.createAcc(name,mobile,acc);
        acc++;
    }
        ldk.viewAcc();
    }
}

*/
/*
class Node{

     Object data;
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
    public  Node createNode(Object data){
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
            current.next=(temp);
        current=temp;
    }

      public void addAtFirst(Object data){
        Node temp=createNode(data);
        if(start==null)
            start=temp;
        else
        {
            temp.next=(start);
            start=temp;
        }
    }
    public String toString(){
        Node temp=start;
        String s=" ";
        while(temp!=null)
        {
            s=s+", "+temp.getData();
            temp=temp.getNext();
        }
        return "["+s.substring(2)+"]";
    }
}



class Test{

    public static void main(String[] args){
      
      LinkList l=new LinkList();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      l.add(5);
      l.addAtFirst(3);

      LinkList l1=new LinkList(l);
      l1.add(29);
      l1.add(33);
      l1.add(41);
      l1.add(52);
      l1.add(11);
      l1.addAtFirst(3);


System.out.println(l);
  System.out.println(l1);
        
    }

}

*/

