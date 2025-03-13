class swap{
    public static void main(String[] args)
    {
        int a=10;
        int b=90;
        System.out.println("Before printing "+a+"  "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+a+ " " +b);
    }
}