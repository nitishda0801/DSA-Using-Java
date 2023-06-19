public class Throws 
{
    void demo() throws IllegalAccessException
    {
        throw new IllegalAccessException();
    }
    public static void main(String[] args)
    {
        try{
            Throws t=new Throws();
            t.demo();
        }
        catch(IllegalAccessException ae)
        {
            System.out.println("Illegal");
        }
    }
}
