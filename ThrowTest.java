public class ThrowTest {
   static void test()
   {
       try{
       throw new ArithmeticException();
       }
       catch(ArithmeticException ae)
       {
        System.out.println("Inside test()");
        throw ae;
       }
   } 
   public static void main(String[] args) {
       {
           try
           {
               test();
           }
           catch(ArithmeticException ae)
           {
               System.out.println("Inside main"+ae);
           }
       }
   }
   
}
