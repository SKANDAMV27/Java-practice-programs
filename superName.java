class A{
    A(){
    //super();
     System.out.println("Int A");
   }
    A(int n)
   {
    super();
    System.out.println(n+" kanda");
   }

}

class B extends A{
    B(){
        //super();
        System.out.println("INT B");
    }
    B(int m)
    {
        this();
        System.out.println(m+"");
    }

}

class superName{
    public static void main(String[] args)
    {
        B obj = new B(5);
        
    }
}