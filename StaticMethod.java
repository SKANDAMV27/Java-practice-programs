class Mobile{
    String brand; //instance variable
    long number; //instance variable
    static String name; // static variable

    public void show(){
        System.out.println(brand+" : "+number+" :"+name);
    }

   public void show1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+obj.number+ " : "+obj.name);
    }
}
class StaticMethod{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand="Real-Me";
        obj1.number=9353193240l;
        obj1.name="Skanda M V";

        Mobile obj2 = new Mobile();
        obj2.brand = "MI";
        obj2.number=7975753241l;
        obj2.name="Pravith A P";

        obj1.show();
        obj2.show();

        obj1.show1(obj2);
        obj2.show();

    }
}