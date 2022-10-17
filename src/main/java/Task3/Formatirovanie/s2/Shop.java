package Task3.Formatirovanie.s2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    private static Tovar[] stock;
    private static Scanner sc;

    public static void main(String[] args) {
        init();
        printStock();
        System.out.println("Enter index of tovar");
        int ind = sc.nextInt();
        Tovar t = getTovar(ind);
        System.out.println("Chosen tovar is " + t);
        System.out.println("Enter valute");
        System.out.println(Tovar.ratios.keySet());
        String valute = sc.next();
        t.setValute(valute);
        System.out.println("Cost of tovar is " + t.getCost() + " " + t.getValute());
    }

    private static Tovar getTovar(int i) {
        return stock[i];
    }

    private static void printStock() {
        System.out.println("Stock is: ");
        for (Tovar tovar : stock) {
            System.out.println("   " + tovar);
        }
        System.out.println();
    }

    private static void init() {
        stock = new Tovar[3];
        stock[0] = new Tovar(10.0, "banan", "dub");
        stock[1] = new Tovar(20.0, "apple");
        stock[2] = new Tovar(30.0, "spoon");

        sc = new Scanner(System.in);
    }
}
