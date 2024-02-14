import java.util.*;
class userinput{
   public static void main(String [] args)
   {
       try (Scanner s = new Scanner(System.in)) {
        System.out.println("Enter integer value");
           int a=s.nextInt();
           System.out.println("Enter double value");
           double b=s.nextDouble();
           System.out.println("Enter float value");
           float f=s.nextFloat();
           System.out.println("Enter sentence");
           s.nextLine();
           String st=s.nextLine();
           
           System.out.println("String;"+st);
           System.out.println("Double:"+b);
           System.out.println("Int:"+a);
           System.out.println("Float:"+f);
    }
   }
}
