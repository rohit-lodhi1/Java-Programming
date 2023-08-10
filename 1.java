import java.util.*;
class Test{
  int a=10;
  static int b=20;
    public int  fun(int price,int dis){

        int finpri;
        finpri=price*dis/100;
        finpri=price-finpri;
        return finpri;
    }
public static void main(String[] args) {
    
      Test t=new Test();
      Scanner sc=new Scanner(System.in);
      System.out.println("Entre the price");
      int p=sc.nextInt();
      System.out.println("Entre the discount");
      int d=sc.nextInt();

      System.out.println("Final Price"+t.fun(p,d));

}

}