package Task6;

import Task6.application.Printable;

public class Shop implements Printable {

    @Override
    public String toString() {
        return "Im a shop";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
