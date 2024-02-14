 abstract  class Media {
    int id;
    String desc;
    abstract void display();
}
class Book extends Media
{
    int pagecount;
    Book(int p,int i,String s)
    {
        pagecount=p;
        id=i;
        desc=s;
    }
    void display()
    {
        System.out.println(pagecount);
        System.out.println(id);
        System.out.println(desc);
    }
}
class CD extends Media
{
    int pt;
    int id;
    String desc;
    CD(int pe,int i,String s)
    {
        pt=pe;
        id=i;
        desc=s;
    }
        void display()
        {
            System.out.println(pt);
            System.out.println(id);
            System.out.println(desc);
        }
}
 class Absexemple
{
    public static void main (String [] args)
    {
        Book b=new Book(12,13,"Hello" );
        b.display();
        CD c=new CD(14,15,"World");
        c.display();
    }

}
