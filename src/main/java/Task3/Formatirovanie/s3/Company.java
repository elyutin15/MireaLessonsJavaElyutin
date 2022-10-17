package Task3.Formatirovanie.s3;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Grisha", 100500);
        employees[1] = new Employee("Misha", 1011010);
        employees[2] = new Employee("Pahan", 1023523);
        Report.generateReport(employees);
    }
}
