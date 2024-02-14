public class Multiple_catch {
    public static void main(String[] args)
    {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("Result="+c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Enter second value except zero");
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("Enter the two number");
        }
        catch(NumberFormatException na)
        {
            System.out.println("Enter numeric value");
        }
    }
}
