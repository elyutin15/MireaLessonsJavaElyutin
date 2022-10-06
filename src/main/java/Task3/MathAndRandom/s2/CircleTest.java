package Task3.MathAndRandom.s2;


import java.util.Arrays;
import java.util.Scanner;

import Task2.s3.Point;

public class CircleTest {

    static Circle[] circles;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        circles = new Circle[n];

        for (int i = 0; i < n; ++i) {
            circles[i] = new Circle(new Point(Math.random(), Math.random()), Math.random());
        }

        System.out.println(Arrays.toString(circles));
        sort();
        System.out.println(Arrays.toString(circles));
        System.out.println(findWithJudge(false));
        System.out.println(findWithJudge(true));
    }

    public static Circle findWithJudge(boolean findMax) {
        if (n <= 0) {
            return null;
        }
        Circle ans = circles[0];
        for (int i = 1; i < n; ++i) {
            if ((circles[i].getR() > ans.getR()) ^ findMax) {
                ans = circles[i];
            }
        }
        return ans;
    }

    public static void sort() {
        Arrays.sort(circles, (a, b) -> {return Double.compare(a.getR(), b.getR());});
    }
}
