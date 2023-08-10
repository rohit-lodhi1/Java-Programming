import java.util.*;
class Table{

	public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the NO");
		int n=sc.nextInt();
		inttoBin(n);

	}
	public static void inttoBin(int n){

          int b[]={0,0,0,0,0,0,0,0};
          int i,c=7,r;
          while(c>=0)
          {
          	r=n%8;
          	n=n/8;
          	b[c--]=r;
          }
          c=0;
          while(c<=7)
          {
          	System.out.print(b[c++]+" ");
          }
		
	}
}