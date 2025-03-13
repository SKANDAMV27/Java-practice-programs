class calc{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class advance extends calc{
    public int add(int n1,int n2)
    {
        return n1+n2+2;
    }
}
class overwriting{
    public static void main(String[] args)
    {
       advance cl= new advance();
       int r1=cl.add(10,23);
       System.out.println(r1);
    }
}