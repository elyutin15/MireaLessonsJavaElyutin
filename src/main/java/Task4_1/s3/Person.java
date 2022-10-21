package Task4_1.s3;

public class Person {
    private String fullname;
    private Integer age;

    public Person() {
        fullname = "unknown";
        age = 0;
    }

    public Person(String fullname, Integer age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void move() {
        System.out.println(fullname + " is moving");
    }

    public void talk() {
        System.out.println(fullname + " is talking");
    }
}
