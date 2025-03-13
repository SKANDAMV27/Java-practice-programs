class details{
    private int studentId;
    private String name;
    private char grade;

    public details(int studentId,String name,char grade)
    {
        this.studentId=studentId;
        this.name=name;
        this.grade=grade;
    }
    public int getstudentId()
    {
        return studentId;
    }
    public void setstudentId(int studentId)
    {
        this.studentId=studentId;
    }
    public  String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public char getgrade(char grade)
    {
        return grade;
    }
    public void setgrade(char grade)
    {
        if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='E')
        {
            this.grade=grade;
        }
        else
        {
            System.out.println("Faile");
        }
    }

    public void displayStudentDetails()
    {
        System.out.println("StudentId: "+studentId+" name "+name+" Grade:"+grade);
    }
}
class student
{
    public static void main(String[] args)
    {
        details std =new details(14,"Skanda",'A');
       // std.studentId(14);
        //std.name("Skanda");
        //std.grade('A');

        //details std1= new details();

        details std1= new details(45,"Abhi",'B');
        //std1.studentId(45);
        //std1.name("Abhi");
        //std1.grade('B');

        System.out.println("Student Details:");
        std.displayStudentDetails();
        std1.displayStudentDetails();
    }
}