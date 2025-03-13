class Student{
    int rollNumber;
    String name;
    int marks;
}
class objectarray{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollNumber=1;
        s1.name="Skanda";
        s1.marks=45;

        Student s2 = new Student();
        s2.rollNumber=2;
        s2.name="Pravith";
        s2.marks=95;

        Student s3 = new Student();
        s3.rollNumber=3;
        s3.name="Maruthi";

        Student[] Students = new Student[3];
        Students[0] = s1;
        Students[1]= s2;
        Students[2]= s3;

        for(int i=0;i<Students.length;i++)
        {
            System.out.println(Students[i].rollNumber+ " : "+Students[i].name+ " : "+Students[i].marks+ "");
        }
        System.out.println();

        

    }
}