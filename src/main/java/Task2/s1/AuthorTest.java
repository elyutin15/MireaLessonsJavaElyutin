package Task2.s1;

public class AuthorTest {
    public static void main(String[] args) {
        Author a = new Author("Yhhel", "yhhel@mail.com", 'M');
        System.out.println(a);
        a.setEmail("test@dot.com");
        System.out.println(a);
    }
}
