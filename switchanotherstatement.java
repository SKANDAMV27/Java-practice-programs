public class java1{
    public static void main(String[] args)
    {
        String day = MONDAY;
        switch(day){
            case "MONDAY" ->System.out.println("6am");
            break;
            case "SATURDAY","WEDNESDAY" ->System.out.println("7am");
            break;
            default ->System.out.println("8am");

        }
    }
}