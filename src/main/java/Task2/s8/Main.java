package Task2.s8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; ++i) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n / 2; ++i) {
            String mid = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = mid;
        }
        System.out.println(Arrays.toString(s));
    }
}
