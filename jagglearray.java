class jagglearray{
    public static void main(String[] args)
    {
        int num[][] = new int[4][]; //this is called as a jaggle array
        num[0]= new int[4];
        num[1]=new int[2];
        num[2]=new int[6];
        int random=0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j] =(int)(Math.random()*100);
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}