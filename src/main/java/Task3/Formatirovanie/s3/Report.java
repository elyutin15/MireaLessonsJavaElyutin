package Task3.Formatirovanie.s3;

import java.util.Arrays;

public class Report {

    public static void generateReport(Employee[] employees) {
        System.out.println("report:");
        for (var i : employees) {
            System.out.printf("%-15s - %15d\n", i.getFullname(), i.getSalary());
        }
    }
}
