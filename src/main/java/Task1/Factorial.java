package Task1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n;
            n--;
        }
        return ans;
    }
}
