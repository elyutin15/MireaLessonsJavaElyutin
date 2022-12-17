package Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGpa {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        setArray(5);
        ArrayList<Student> cpStudents = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            cpStudents.add(students.get(i));
        }
        printArray();
        quickSort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int av = o1.gradeInf + o1.gradeMath + o1.gradeSport;
                int bv = o2.gradeInf + o2.gradeMath + o2.gradeSport;
                return bv - av;
            }
        });
        printArray();
        students = cpStudents;
        mergeSort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int av = o1.gradeInf + o1.gradeMath + o1.gradeSport;
                int bv = o2.gradeInf + o2.gradeMath + o2.gradeSport;
                return bv - av;
            }
        });
        printArray();
    }

    public static void setArray(int n) {
        students.clear();

        for (int i = 0; i < n; ++i) {
            students.add(new Student("Student",
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
    }

    public static void quickSort(ArrayList<Student> students, Comparator<Student> cmp) {
        students.sort(cmp);
    }

    public static void mergeSort(ArrayList<Student> ar, Comparator<Student> cmp) {
        if (ar.size() <= 1) {
            return;
        }
        ArrayList<Student> a = new ArrayList<>();
        ArrayList<Student> b = new ArrayList<>();
        for (int i = 0; i < ar.size(); ++i) {
            if (i * 2 < ar.size()) {
                a.add(ar.get(i));
            }
            else {
                b.add(ar.get(i));
            }
        }
        mergeSort(a, cmp);
        mergeSort(b, cmp);
        ar.clear();
        int l = 0, r = 0;
        while (l < a.size() && r < b.size()) {
            int av = a.get(l).gradeInf + a.get(l).gradeMath + a.get(l).gradeSport;
            int bv = b.get(r).gradeInf + b.get(r).gradeMath + b.get(r).gradeSport;
            if (cmp.compare(a.get(l), b.get(r)) < 0) {
                ar.add(a.get(l++));
            }
            else {
                ar.add(b.get(r++));
            }
        }
        while (l < a.size()) {
            ar.add(a.get(l++));
        }
        while (r < b.size()) {
            ar.add(b.get(r++));
        }
    }

    public static void printArray() {
        for (Student i : students) {
            System.out.println(i);
        }
        System.out.println();
    }
}
