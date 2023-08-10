class Word{
    public void hello(){

    }
}

class India{
              Word t = new Word(){
                public void w(){
                    System.out.println("hello");
                }
      };
}

 class Test{
    public static void main(String[] args) {
        India i = new India();
        i.t.hello();
    }
}