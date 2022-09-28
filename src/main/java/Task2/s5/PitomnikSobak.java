package Task2.s5;

import java.util.ArrayList;
import java.util.Scanner;

public class PitomnikSobak {
    private static Scanner sc;

    public static Dog input() {
        System.out.println("Enter dog name and dog age");
        String name = sc.next();
        int age = sc.nextInt();
        return new Dog(name, age);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        ArrayList<Dog> pitomnik = new ArrayList<>();
        int n = sc.nextInt();
        pitomnik.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            pitomnik.add(input());
        }
        System.out.println(pitomnik);

        while(true) {
            System.out.println("Enter 1 if you want to add a dog\n" +
                                "Enter 2 if you want to get a dog");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    pitomnik.add(input());
                    System.out.println(pitomnik);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter an index of a dog");
                    int ind = sc.nextInt();
                    System.out.println(pitomnik.get(ind));
                    System.out.println();
                    break;
            }
        }
    }
}
