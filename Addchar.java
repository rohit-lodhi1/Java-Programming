  class Table{

  	  public static void main(String[] args){

  	  	String s="hello";
  	  	char ch[]=s.toCharArray();
  	  	ch[3]='o';
  	  	s=new String(ch);
  	  	System.out.println(s);
  	  }
  }