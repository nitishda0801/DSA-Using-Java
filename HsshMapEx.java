import java.util.*;
class HsshMapEx
{
	public static void main(String args[]){
		HashMap<Integer,String> al = new HashMap<>();
		al.put(1,"Blue");
		al.put(2,"Green");
		al.put(3,"Yellow");
		al.put(4,"Pink");
		Iterator<Integer> itr=al.keySet().iterator();
		while(itr.hasNext())
		{
			int n=(int)itr.next();
			System.out.println(n+"  "+al.get(n));
		}
	}
}