package Task9;

public class Student {
    int id;
    int gradeMath;
    int gradeInf;
    int gradeSport;
    String name;

    public Student(int id, int gradeMath, int gradeInf, int gradeSport, String name) {
        this.id = id;
        this.gradeMath = gradeMath;
        this.gradeInf = gradeInf;
        this.gradeSport = gradeSport;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gradeMath=" + gradeMath +
                ", gradeInf=" + gradeInf +
                ", gradeSport=" + gradeSport +
                ", name='" + name + '\'' +
                '}';
    }
}
