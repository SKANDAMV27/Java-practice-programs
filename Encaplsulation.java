class person{
    private int age;
    private String name;

    public void getAge();
    {
        return age;
    }
    public void setAge(int age);
    {
        age=45;
    }
    public String getName();
    {
        return name;
    }
    public String setName(String name);
    {
        name="Skanda";
    }

}
class Encaplsulation{
    public static void main(String[] args)
    {  
        person human =new person();
        System.out.println("Name: "+name+" Age: "+age);
    }
}