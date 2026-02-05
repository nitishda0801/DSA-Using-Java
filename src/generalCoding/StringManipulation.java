package src.generalCoding;

import java.util.Scanner;

class StringManipulation {
    public static int solve(String s, int n) {
        if (n == 0)
            return 0;
        int ans = s.charAt(0) - '0';
        for (int i = 1; i < n; i += 2) {
            char c = s.charAt(i);
            if (c == 'A') {
                ans = ans & s.charAt(i + 1) - '0';
            } else if (c == 'B') {
                ans = ans | s.charAt(i + 1) - '0';
            } else {
                ans = ans ^ s.charAt(i + 1) - '0';
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        System.out.println(solve(s, n));

    }
}