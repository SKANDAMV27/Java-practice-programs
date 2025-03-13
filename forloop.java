public class forloop{
    public static void main(String[] args)
    {
       //this type of forloop works
        int i=0;
        int j=0;
        for(i=1;i<=7;i++)
        {
            System.out.println("DAYS: "+i);
            for(j=1;j<=24;j++)
            {
                System.out.println("HOURS: "+j);
            }
        }


        //this a type of forloop works in calender problem for working days
        int z=0;
        int a=0;
        int c=0;
        for(z=1;z<=5;z++)
        {
            System.out.println("DAYS :"+z);
            for(a=1;a<=3;a++)
            {
                System.out.println("Working Hours :"+(a+8)+ "am");
            }
             for(int y=12;y<=12;y++)
        {
            System.out.println("WORKING HOURS :"+y+"pm");
        }
        for(c=1;c<=5;c++)
        {
            System.out.println("WORKING HOURS :"+c+"pm");
        }
        }

        //this reversing of the number
        int g=0;
        for(g=10;g>=0;g--)
        {
            System.out.println(+g);
        }
       
    }
}