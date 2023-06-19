public class FinallyTest {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{
            arr[7]=10;
            System.out.print("Seventh element value:"+arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException ar)
        {
            System.out.println("Exception thrown :"+ar);
        }
        finally
        {
            arr[0]=5;
            System.out.println("First element :"+arr[0]);
            System.out.println("The finally statement is executed");

        }
    }
}
