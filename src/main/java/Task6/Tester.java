package Task6;

import Task6.application.Printable;

public class Tester {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Apple apple = new Apple();
        System.out.println(earth.getName());
        System.out.println(apple.getPrice());


        Printable[] literatures = new Printable[5];
        for (int i = 0; i < 5; ++i) {
            literatures[i] = i%2 == 0
                    ? new Book()
                    : new Shop();
        }
        for (Printable i : literatures) {
            i.print();
        }
    }
}
