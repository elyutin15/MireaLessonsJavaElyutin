package Task6.internetMagaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private static ArrayList<Computer> computers;
    private static ComputerInput computerInput;
    private static Scanner sc;

    public static void main(String[] args) {
        init();

        while(true) {
            menu();
            String s = sc.next().toLowerCase();
            int series;
            switch (s) {
                case "add":
                    series = computerInput.input();
                    System.out.println("computer added - " + add(series));
                    break;
                case "erase":
                    series = computerInput.input();
                    System.out.println("computer erased - " + erase(series));
                    break;
                case "find":
                    series = computerInput.input();
                    System.out.println("computer with series " + series + " on " + find(series));
                    break;
                case "print":
                    for (Computer i : computers) {
                        System.out.println(i);
                    }
                    break;
                default:
                    System.out.println("Unknown operation");
            }
            System.out.println();
        }

    }

    public static void menu() {
        System.out.println("Following command are available:");
        System.out.println("add a computer - add");
        System.out.println("erase a computer - erase");
        System.out.println("find a computer - find");
        System.out.println("print computers - print");
    }

    public static void init() {
        computers = new ArrayList<>();
        sc = new Scanner(System.in);

        computerInput = new ComputerInput() {
            @Override
            public int input() {
                while(true) {
                    System.out.println("Enter computer series");
                    try {
                        return sc.nextInt();
                    } catch (Exception e) {
                        sc.next();
                        System.out.println("Invalid series. Try again");
                    }
                }
            }
        };
    }

    public static boolean add(int series) {
        int index = find(series);
        if (index == -1) {
            computers.add(new Computer(series));
            return true;
        }
        return false;
    }

    public static boolean erase(int series) {
        int index = find(series);
        if (index != -1) {
            computers.remove(index);
            return true;
        }
        return false;
    }

    public static int find(int series) {
        for (int i = 0; i < computers.size(); ++i) {
            if (computers.get(i).series == series) {
                return i;
            }
        }
        return -1;
    }
}
