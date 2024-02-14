import java.util.Scanner;

class ArrayDiff {
    public static int solve(int a[], int num, int diff) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            int d = Math.abs(a[i] - num);
            if (d <= diff)
                c++;
        }
        if (c == 0)
            return -1;
        return c;
    }

    public static void main(String[] args) {
        // Scanner cs = new Scanner(System.in);
        // int n = cs.nextInt();
        // int a[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     a[i] = cs.nextInt();
        // }
        // int num = cs.nextInt();
        // int diff = cs.nextInt();
        // System.out.println(solve(a, num, diff));
        String str="-11";
        System.err.println(Integer.parseInt(str));
    }
}
