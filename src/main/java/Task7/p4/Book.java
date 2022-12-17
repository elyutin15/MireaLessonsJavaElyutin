package Task7.p4;

import Task6.application.Printable;

public class Book implements Printable {

    @Override
    public String toString() {
        return "Im a book";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    public static void printBooks(Printable[] printables) {
        System.out.println("Books:");
        for (Printable i : printables) {
            if (i instanceof Book) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
