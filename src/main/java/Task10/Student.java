package Task10;

public class Student {
    String name;
    String surname;
    String speciality;
    int course;
    int group;
    int id;
    int gradeMath;
    int gradeInf;
    int gradeSport;


    public Student(String name, String surname, String speciality, int course, int group, int id, int gradeMath, int gradeInf, int gradeSport) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.id = id;
        this.gradeMath = gradeMath;
        this.gradeInf = gradeInf;
        this.gradeSport = gradeSport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public int getGradeInf() {
        return gradeInf;
    }

    public int getGradeSport() {
        return gradeSport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = gradeMath;
    }

    public void setGradeInf(int gradeInf) {
        this.gradeInf = gradeInf;
    }

    public void setGradeSport(int gradeSport) {
        this.gradeSport = gradeSport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", id=" + id +
                ", gradeMath=" + gradeMath +
                ", gradeInf=" + gradeInf +
                ", gradeSport=" + gradeSport +
                '}';
    }
}
