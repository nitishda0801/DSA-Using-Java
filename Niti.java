 class Superkeybword
{
    //abstract void show();
   final int a=13;
   void  show()
    {
        System.out.println(a);
    }
}
class Keyword extends Superkeybword
{
     //a=20;

    Keyword()
    {
        
        System.out.println(a);
    }
    void show()
    {
        System.out.println("ABstract method  class");
    }
}

public class Niti {
    public static void main(String [] args)
    {
        Superkeybword k=new Keyword();
       //k.dis();
       k.show();
      // Superkeybword s=new Superkeybword();
        //k.display();
    }
    
}
