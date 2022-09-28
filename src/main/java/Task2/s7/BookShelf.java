package Task2.s7;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class BookShelf {
    private Book[] shelf;
    private int length;
    private int capacity;

    public BookShelf(Book[] inputShelf, int n) {
        if (n < 0)
            n = 0;
        this.length = n;
        int temp = 1;
        while (temp <= n) {
            temp *= 2;
        }
        this.capacity = temp;
        this.shelf = new Book[capacity];
        System.arraycopy(inputShelf, 0, shelf, 0, n);
    }

    public BookShelf() {
        this.shelf = new Book[1];
        this.length = 0;
        this.capacity = 1;
    }

    public void add(Book book) {
        if (length + 1 < capacity) {
            shelf[length++] = book;
        }
        else {
            capacity *= 2;
            Book[] newShelf = new Book[capacity];
            System.arraycopy(shelf, 0, newShelf, 0, length);
            shelf = newShelf;
            add(book);
        }
    }

    public Book findLatest() {
        if (length == 0) {
            return null;
        }
        Book answer = shelf[0];
        for (int i = 1; i < length; ++i) {
            if (shelf[i].date.after(answer.date)) {
                answer = shelf[i];
            }
        }
        return answer;
    }

    public Book findEarliest() {
        if (length == 0) {
            return null;
        }
        Book answer = shelf[0];
        for (int i = 1; i < length; ++i) {
            if (shelf[i].date.before(answer.date)) {
                answer = shelf[i];
            }
        }
        return answer;
    }

    public void makeOrdered() {
        Arrays.sort(shelf, 0, length, (a,b) -> {
            if (a.date.before(b.date)) {
                return -1;
            }
            if (a.date.after(b.date)) {
                return 1;
            }
            return 0;
        });
    }

    public Book[] getShelf() {
        return shelf;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n");
        Arrays.stream(shelf).filter(Objects::nonNull).forEach(i -> sb.append(i.toString()).append(",\n"));
        return "BookShelf{" +
                "shelf=" + sb +
                "length=" + length +
                '}';
    }

    public Book createBook(String author, String title, Date date) {
        return new Book(author, title, date);
    }
    public class Book {
        private String author;
        private String title;
        private Date date;


        public Book(String author, String title, Date date) {
            this.author = author;
            this.title = title;
            this.date = date;
        }


        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public Date getDate() {
            return date;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", date=" + date +
                    '}';
        }
    }

}
