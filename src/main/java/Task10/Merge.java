package Task10;

import java.util.ArrayList;
import java.util.Comparator;

public class Merge {


    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        ArrayList<Student> b = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            a.add(new Student("Student",
                    Integer.valueOf(i).toString(),
                    "it",
                    (int)(Math.random() * 4 + 1),
                    (int)(Math.random() * 30 + 1),
                    i,
                    (int)(Math.random() * 5 + 1),
                    (int)(Math.random() * 5 + 1),
                    (int)(Math.random() * 5 + 1))
            );
        }
        for (int i = 0; i < 5; ++i) {
            b.add(new Student("Student",
                    Integer.valueOf(5 + i).toString(),
                    "it",
                    (int)(Math.random() * 4 + 1),
                    (int)(Math.random() * 30 + 1),
                    i,
                    (int)(Math.random() * 5 + 1),
                    (int)(Math.random() * 5 + 1),
                    (int)(Math.random() * 5 + 1))
            );
        }

        System.out.println("A:");
        for (Student i : a) {
            System.out.println(i);
        }
        System.out.println("B:");
        for (Student i : b) {
            System.out.println(i);
        }
        System.out.println();
        ArrayList<Student> result = new ArrayList<>();
        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int av = o1.gradeInf + o1.gradeMath + o1.gradeSport;
                int bv = o2.gradeInf + o2.gradeMath + o2.gradeSport;

                return av - bv;
            }
        };
        a.sort(c);
        b.sort(c);
        int l = 0, r = 0;
        while (l < a.size() && r < b.size()) {
            int av = a.get(l).gradeInf + a.get(l).gradeMath + a.get(l).gradeSport;
            int bv = b.get(r).gradeInf + b.get(r).gradeMath + b.get(r).gradeSport;
            if (av < bv) {
                result.add(a.get(l++));
            }
            else {
                result.add(b.get(r++));
            }
        }
        while (l < a.size()) {
            result.add(a.get(l++));
        }
        while (r < b.size()) {
            result.add(b.get(r++));
        }
        System.out.println("Result:");
        for (Student i : result) {
            System.out.println(i);
        }

    }
}
