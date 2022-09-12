package zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int n = sc.nextInt();
        int l = 0, r = 1, c = 1;
        while (c <= n + from) {
            if (c >= from) {
                System.out.print(l + " ");
            }
            int f = l + r;
            l = r;
            r = f;
            c++;
        }
    }
}
