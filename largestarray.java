class largestarray{
    public static void main(String[] args)
    {
        int [] num={14,45,78,9547,3,412};
        int largest=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                largest=num[i];
                
            }
        }
        System.out.println("Largest Number Inthe Array: "+largest);
    }
}