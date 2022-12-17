package Task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, 4, 4, 4, "Maks"));
        students.add(new Student(4, 4, 5, 4, "Iva"));
        students.add(new Student(2, 5, 4, 5, "Marci"));
        students.add(new Student(3, 5, 5, 5, "Jack"));
        insertionSort(students);
        System.out.println(students.stream().map(i -> i.id).collect(Collectors.toList()));
        students.sort(new SortingStudentsByGPA());
        System.out.println(students.stream().map(i -> i.gradeSport + i.gradeInf + i.gradeMath).collect(Collectors.toList()));

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student(1, 4, 4, 4, "Maks"));
        students1.add(new Student(4, 4, 5, 4, "Iva"));
        students1.add(new Student(7, 5, 4, 5, "Marci"));
        students1.add(new Student(3, 5, 5, 5, "Jack"));

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student(2, 4, 4, 4, "Maks"));
        students2.add(new Student(8, 4, 5, 4, "Iva"));
        students2.add(new Student(5, 5, 4, 5, "Marci"));
        students2.add(new Student(6, 5, 5, 5, "Jack"));
        mergeSort(students1, students2);
        System.out.println(students1.stream().map(i -> i.id).collect(Collectors.toList()));

        ComparableImpl[] students3 = new ComparableImpl[4];
        students3[0] = new ComparableImpl(new Student(7, 4, 4, 4, "Maks"));
        students3[1] = new ComparableImpl(new Student(8, 4, 5, 4, "Iva"));
        students3[2] = new ComparableImpl(new Student(5, 5, 4, 5, "Marci"));
        students3[3] = new ComparableImpl(new Student(6, 5, 5, 5, "Spark"));
        Arrays.sort(students3);
        System.out.println(Arrays.stream(students3).map(i -> i.t.gradeSport + i.t.gradeInf + i.t.gradeMath).collect(Collectors.toList()));
    }

    public static void insertionSort(ArrayList<Student> students) {
        ArrayList<Student> sorted = new ArrayList<>();
        for (int i = 0; i < students.size(); ++i) {
            int ind = i;
            for (int j = 0; j < i; ++j) {
                if (sorted.get(j).id > students.get(i).id) {
                    ind = j;
                    break;
                }
            }
            sorted.add(ind, students.get(i));
        }
        for (int i = 0; i < students.size(); ++i) {
            students.set(i, sorted.get(i));
        }
    }

    public static void mergeSort(ArrayList<Student> a, ArrayList<Student> b) {
        if (a.size() == 0 || b.size() == 0) {
            return;
        }
        ArrayList<Student> a1 = new ArrayList<>();
        ArrayList<Student> a2 = new ArrayList<>();
        ArrayList<Student> b1 = new ArrayList<>();
        ArrayList<Student> b2 = new ArrayList<>();

        for (int i = 0; i < a.size(); ++i) {
            if (2 * i < a.size()) {
                a1.add(a.get(i));
            }
            else {
                a2.add(a.get(i));
            }
        }

        for (int i = 0; i < b.size(); ++i) {
            if (2 * i < b.size()) {
                b1.add(b.get(i));
            }
            else {
                b2.add(b.get(i));
            }
        }
        mergeSort(a1, a2);
        mergeSort(b1, b2);
        int l = 0, r = 0;
        ArrayList<Student> result = new ArrayList<>();

        while (l < a1.size() && r < b1.size()) {
            if (a1.get(l).id < b1.get(r).id) {
                result.add(a1.get(l++));

            }
            else {
                result.add(b1.get(r++));
            }
        }
        while (l < a1.size()) {
            result.add(a1.get(l++));
        }
        while (r < b1.size()) {
            result.add(b1.get(r++));
        }
        a.clear();
        a.addAll(result);
    }
}
