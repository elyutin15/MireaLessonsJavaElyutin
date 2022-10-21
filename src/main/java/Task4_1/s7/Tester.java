package Task4_1.s7;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Learner[] a = new Learner[3];
        a[0] = new Scholar();
        a[1] = new Student();
        a[2] = new Student();

        printStudents(a);
        printScholars(a);
    }

    public static void printStudents(Learner[] a) {
        System.out.println("Students:");
        for (Learner i : a) {
            if (i instanceof Student) {
                i.print();
            }
        }
    }

    public static void printScholars(Learner[] a) {
        System.out.println("Scholars:");
        for (Learner i : a) {
            if (i instanceof Scholar) {
                i.print();
            }
        }
    }
}
