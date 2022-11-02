package Task6;

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
}
