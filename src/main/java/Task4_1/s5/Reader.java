package Task4_1.s5;

import java.time.Instant;
import java.util.Date;

public class Reader {
    private String fullname;
    private Integer number;
    private String faculty;
    private Instant date;
    private Integer mobileNumber;

    public Reader(String fullname, Integer number, String faculty, Instant date, Integer mobileNumber) {
        this.fullname = fullname;
        this.number = number;
        this.faculty = faculty;
        this.date = date;
        this.mobileNumber = mobileNumber;
    }

    public void takeBook(Integer count) {
        System.out.println(fullname + " take a " + count + " books");
    }

    public void takeBook(String... books) {
        System.out.println(fullname + " take a books:");
        for (String i : books) {
            System.out.println(i);
        }
    }

    public void returnBook(Integer count) {
        System.out.println(fullname + " return a " + count + " books");
    }

    public void returnBook(String... books) {
        System.out.println(fullname + " return a books:");
        for (String i : books) {
            System.out.println(i);
        }
    }
}
