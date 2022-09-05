package zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> kektor = new ArrayList<>();
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 0; i < n; ++i) {
            kektor.add(sc.nextInt());
            sum1 += kektor.get(i);
        }

        int n2 = n;
        while (--n2 >= 0) {
            sum2 += kektor.get(n2);
        }

        n2 = n;
        do {
            sum3 += kektor.get(n2-1);
        } while(--n2>0);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}