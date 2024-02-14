class A
{
    final void show()
    {
        System.out.println("class A");
    } 
}
class B extends A{
    /*void show()
    {
        System.out.println("Child class");
    }*/
}
public class Unit2final {
    public static void main(String [] args)
    {
        B b=new B();
        b.show();
       // b.print();
    }
}
