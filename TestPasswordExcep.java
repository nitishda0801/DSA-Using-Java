class InvalidPasswordException extends Exception
{
    InvalidPasswordException(String s)
    {
        super(s);
    }
}
public class TestPasswordExcep {
    static void Enter_password(int digit) throws InvalidPasswordException
    {
        if(digit!=4433)
        throw new InvalidPasswordException("You entered wrong password");
        else
        System.out.println("Welcome to Social media...");
    }
    public static void main(String[] args) {
        try {
            Enter_password(4403);
        } catch (Exception e) {
            System.out.println("Exception ocured :"+e);
        }
    }
}
