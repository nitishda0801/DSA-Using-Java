
class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
public class TestUserdefinedExcep {
    static void valid_date(int  age) throws InvalidAgeException
    {
        if(age<18)
        throw new InvalidAgeException("Not valid for voting...");
        else
        System.out.println(" Welcome to voting...");
    }
    public static void main(String[] args) {
        try{
            valid_date(17);
        }
        catch(InvalidAgeException m)
        {
        System.out.println("Exception occurred :"+m);
        System.out.println(" rest of the code...");
        }
    }
}
