
class InsufficientFund extends Exception
{
    InsufficientFund(String s)
    {
        super(s);
    }
}
public class TestBankException {
    static void withdraw(int amount)throws InsufficientFund
    {
        if(amount<1000)
        throw new InsufficientFund("You cnn't withdraw.. amount not sufficient");
        else
        System.out.println("Ready to withdraw");
    }
    public static void main(String[] args) {
        try{
            withdraw(200);
        }catch(InsufficientFund f)
        {
            System.out.println("Exception occured!:"+f);
            System.out.println("welcome to using ATM...");
        }
    }
}
