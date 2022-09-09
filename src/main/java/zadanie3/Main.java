package zadanie3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> kektor = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            kektor.add(r.nextInt(100));
        }
        Collections.sort(kektor);
        System.out.println(kektor);
        System.out.println();
        for (int i = 0; i < n; ++i) {
            kektor.set(i, (int)(Math.random()*100));
        }
        Collections.sort(kektor);
        System.out.println(kektor);
    }
}
