class Main
{
    public static void main(String... args)
    {
        int id = 100;
        String name ="Skanda";
        double salary=50000;
        String designation="Full Stack Developer";
        Employe employee = new Employe(id,name,salary,designation);
        System.out.println("Employee Details:");
        System.out.println("Employee ID: "+employee.id);
        System.out.println("Employee Name: "+employee.name);
        System.out.println("Employee Salary: "+employee.salary);
        System.out.println("Employee Designation: "+employee.designation);
        System.out.println("End");

    }
}