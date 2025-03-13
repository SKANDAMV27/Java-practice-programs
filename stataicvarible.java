class Mobile{
    String company;
    static String name; //// if we use static means assign both the object with the same value.
    int price;
    public void show()
    {
        System.out.println(company+" : "+name+" : "+price);
    }
}
class stataicvarible{
    public static void main(String[] args)
    {
        Mobile obj1= new Mobile();
        obj1.company="APPLE";
        obj1.name="hgt";
        obj1.price=458125;

        Mobile obj2 = new Mobile();
        obj2.company="SAMSONG";
        obj2.name="kjh";
        obj2.price=74102;

        obj1.name="phone";
        obj1.show();
        obj2.show();


                                        ////so its name should be same for both
    
    }



}