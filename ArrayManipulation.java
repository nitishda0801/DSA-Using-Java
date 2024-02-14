import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<String> list1 = new ArrayList<>();
        // list1.add("prince");
        // list1.add("nks");
        // list1.add("kgg");
        // System.out.println(list1);

        // int a[]=new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        // list.add(sc.nextInt());
        // }
        // method1
        // for(Integer i:list)
        // {
        // System.out.print(i+" ");
        // }
        // method1
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();
        // Arrys.sort(a) for array
        // Collections.sort(list);
        // System.out.println(list);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();// O(n) space....
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();// a[]={1,3,4,5,6,7} n=6;
        }
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
        for (int i = 0; i < n + 4; i++) {
            if (!set.contains(i + 1)) {
                System.out.print(i + 1 + " ");
            }
        }

    }
}
