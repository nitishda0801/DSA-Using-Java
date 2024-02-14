import java.util.*;
public class ArraylistEx {
    
    public static void main(String []args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Aman");
        al.add("Raju");
        al.add("Deepu");
        //System.out.println(al);
        Iterator<String> itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.print(" "+itr.next());
        }
    }
}
