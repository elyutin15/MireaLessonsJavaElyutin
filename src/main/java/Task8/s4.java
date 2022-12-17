package Task8;

import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(count(0, k, 0, s));
    }

    public static int count(int pos, int k, int sum, int s) {
        if (pos == k) {
            if (sum == s) {
                return 1;
            }
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < 10; ++i) {
            if (i == 0 && pos == 0) {
                continue;
            }
            ans += count(pos + 1, k, sum + i, s);
        }
        return ans;
    }
}
