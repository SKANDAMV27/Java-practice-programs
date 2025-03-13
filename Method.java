class store
{
    public void book()  //if we write void then ignore return
    {
        System.out.println("BOOK IS AVALIBLE");
    }
    public String pen(int cost) // if we ignore void then we have to write return
    {
        if(cost>=10)
        {
            return"PEN IS AVALIBLE!!! FOR THIS PRICE CONGRALUCATION:";
        }
        else
        {
            return"PEN IS NOT AVALIBLE FOR THIS PRICE!!:";
        }
    }
    public void laptop()
    {
        System.out.println("It is .,,.,<>");
    }
    public String bottle(int num)
    {
        return"k";
    }
}

public class Method{
    public static void main(String[] args)
    {
        store ste = new store(); // this thig we have to create to make link between two class
        ste.book();
        String str=ste.pen(15); // if write return then we have to decleare this line
        System.out.println(str);
        ste.laptop();
        String ktr=ste.bottle(7);
    }

}

//// this program refers to link between two class
// in that we have to use pravite