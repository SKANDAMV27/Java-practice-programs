class account{
    private double balance;
    
    public account(int intinalation)
    {
        if(intinalation>=0)
        balance= intinalation;
        else{
            balance=0;
            System.out.println("Invalid balance");
        }
    }

    public void depsoite(double amount){
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount is deposited! "+amount);
        }
        else 
        {
            System.out.println("Amount is not deposited:");
        } 
    }
    public void Withdraw(double amount)
    {
        if(amount>=0 && amount<=balance){
        balance-=amount;
        System.out.println("Amount is WithDraw: "+amount);
    }
    else
    {
        System.out.println("There is no Minimum balance:");
    }
}
    public double getBalance()
    {
        return balance;
    }
    public void display()
    {
        System.out.println("Current Balance: "+getBalance());
    }
}
class bank{
    public static void main(String[] args)
    {
        account obj =new account(0);
        obj.depsoite(400);
        obj.Withdraw(47);
        //System.out.println("Deposite: "+depsoite+" Withdraw: "+Withdraw);
        obj.display();
        //System.out.println(balance);
    }
}