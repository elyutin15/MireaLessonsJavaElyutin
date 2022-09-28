package Task2.s7;

import java.time.Instant;
import java.util.Date;

public class Tester {

    public static Date genDate() {
        return Date.from(Instant.ofEpochMilli(Instant.now().toEpochMilli() + (int)(Math.random() * 10_000_0000)));
    }
    public static void main(String[] args) {
        BookShelf bs = new BookShelf();
        bs.add(bs.createBook("a1", "b", genDate()));
        System.out.println(bs);
        bs.add(bs.createBook("a2", "b", genDate()));
        System.out.println(bs);
        bs.add(bs.createBook("a3", "b", genDate()));
        bs.add(bs.createBook("a4", "b", genDate()));
        bs.add(bs.createBook("a5", "b", genDate()));
        bs.add(bs.createBook("a6", "b", genDate()));
        System.out.println(bs);
        System.out.println();
        System.out.println("Latest - " + bs.findLatest());
        System.out.println("Earliest - " + bs.findEarliest());
        System.out.println();
        bs.makeOrdered();
        System.out.println(bs);
    }
}
