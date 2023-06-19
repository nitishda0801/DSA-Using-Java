// Java Program to Sort Names in an Alphabetical Order
import java.util.*;

class Sorting_string {
	public static void main(String[] args)
	{
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number of string: ");
			int n = sc.nextInt();
			System.out.println("Enter the string: ");
			String name[]= new String[n];
			for(int i=0;i<n;i++)
			{
			    name[i]=sc.next();
			}
			Arrays.sort(name);
			System.out.println("The names in ascending order are: ");
			for (int i=0; i<n;i++)
			{
				System.out.print(name[i]+" ");
			}
	}
	}
}
