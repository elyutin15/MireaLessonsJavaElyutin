package zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; ++i) {
            sum += 1.0/i;
            System.out.println(String.format("%.2f", 1.0/i));
        }
        System.out.println(String.format("Sum is %.2f", sum));
    }
}
