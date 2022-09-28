package Task2.s10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            cnt++;
            sc.next();
        }
        System.out.println(cnt);
    }
}
