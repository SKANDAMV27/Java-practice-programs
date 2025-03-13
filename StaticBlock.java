class Mobile
{
    String Brand;
    long number;
    static String name;
Mobile(){
    Brand="jkhgf";
    number=200l;
    System.out.println("ITS is CONSTRUCATOE BLOCK !");

}

public void show()
{
    System.out.println(Brand+"Brand: "+number+"number: "+name);
}
 static
 {
    name="Skanda";
    System.out.println("Static Block::!!@#$%^&*(),");

}
}
class StaticBlock{
    public static void main(String[] args)
    {
        Mobile obj = new Mobile();
        obj.show();
   
    }
}
