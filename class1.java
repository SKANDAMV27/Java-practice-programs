
class calc
{
    int a;
    public int add(int n1,int n2);
    {
        int r =  n1 + n2;
        return r;
    }
}
public class class1{
    public static void main(String[] args)
    {
        int num1=47;
        int num2=89;
        calc calacutor = new calc();
        int result = calc.add(num1,num2);
        System.out.println(result); 
    }
}