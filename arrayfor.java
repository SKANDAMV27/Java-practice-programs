class job{
     String company;
        String domean;
        int salary;
}
class arrayfor{
    public static void main(String[] args)
    {
       job j1 = new job();
       j1.company="INFOSIS";
       j1.domean="FULL STACK";
       j1.salary=45000;

       job j2 = new job();
       j2.company="TCS";
       j2.domean="AIML";
       j2.salary=35610;

       job j3 =new job();
       j3.company="CAPGEMINO";
       j3.domean="Deveploer";
       j3.salary=52525;

       job []j4 =new job[3];

       j4[0]=j1;
       j4[1]=j2;
       j4[2]=j3;

       for(job j5:j4){
        System.out.println(j5.company+":"+j5.domean+":"+j5.salary+".");
       }

    }
}