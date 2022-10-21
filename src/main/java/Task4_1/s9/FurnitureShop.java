package Task4_1.s9;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("What do you need: table or chair?");
            String s = sc.next();
            System.out.println("How many legs it must contains? ");
            Integer c = sc.nextInt();
            if (s.equals("table")) {
                Table t = new Table("white", "dub", "magazine table", c);
                System.out.println(t);
                System.out.println(t.getDescription());
            }
            else {
                Chair t = new Chair("white", "dub", "chill chair", c);
                System.out.println(t);
                System.out.println(t.getDescription());
            }
        }
    }
}
