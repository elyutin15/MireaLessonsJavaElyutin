package Task3.MathAndRandom.s1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenAndSort {

    public static void math(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; ++i) {
            a[i] = Math.random();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void random(int n) {
        double[] a = new double[n];
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            a[i] = r.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        math(n);
        random(n);
    }
}
