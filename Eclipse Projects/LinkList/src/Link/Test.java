package Link;

public class Test {

	public static void main(String[] args) {
	  SinglyCircular l1=new SinglyCircular();
	  
	  l1.add(10);
	  l1.add(20);
	  l1.add(30);
	  l1.add(40);
	//  l1.addAtFirst(5);
	  //l1.add(99,7);
	  //l1.deleteAtFirst();
	  l1.delete(2);
	/*  l1.addA(20);
	  l1.add(40); 
	  l1.add(40); 
	  l1.add(50);   */
//	  l1.addAtFirst(5);
//	  l1.addAtFirst(5);

	//  l1.addAtNth(99,10);
	//  l1.addAtNth(99, 2);
	//  l1.deleteAtLast();
	//  l1.deleteAtFirst();
	//  l1.deleteAtNth(2);
	//  System.out.println(l1.current.getData());
	  System.out.println(l1);
	}
}
