package Task9;

public class ComparableImpl implements Comparable<ComparableImpl>{
    Student t;

    public ComparableImpl(Student t) {
        this.t = t;
    }

    @Override
    public int compareTo(ComparableImpl o) {
        Integer a = t.gradeInf + t.gradeMath + t.gradeSport;
        Integer b = o.t.gradeInf + o.t.gradeMath + o.t.gradeSport;
        return a.compareTo(b);
    }

    @Override
    public String toString() {
        return "ComparableImpl{" +
                "t=" + t +
                '}';
    }
}

