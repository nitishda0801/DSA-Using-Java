package src.generalCoding;

import java.util.Scanner;

public class ValidatePassword {
    public static int validate(String s, int n) {
        if (n < 4 || s.indexOf(' ') != -1 || s.indexOf('/') != -1 || Character.isDigit(s.charAt(0)))
            return 0;

        int a = 0, cap = 0, num = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num++;
            else if (c >= 'A' && c <= 'Z')
                cap++;
            else
                a++;
        }
        if (cap > 0 && num > 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(validate(s, s.length()));
    }
}
