package Task4.s3;

import java.util.ArrayList;
import java.util.Scanner;

public class InternetShop {
    private static Scanner sc;
    private static Boolean isLogged = false;
    private static ArrayList<Tovar> korzina;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        korzina = new ArrayList<>();

        while (true) {
            startCommunication();
            String s = sc.next();
            switch (s) {
                case "login":
                    login();
                    break;
                case "categories":
                    categories();
                    break;
                case "catalog":
                    catalog();
                    break;
                case "choose":
                    choose();
                    break;
                case "buy":
                    buy();
                    break;
                default:
                    System.out.println("Unknown command. Try again\n");
            }
        }
    }

    private static void startCommunication() {
        System.out.println("Following operations is available:");
        System.out.println("    1) login");
        System.out.println("    2) categories");
        System.out.println("    3) catalog {category}");
        System.out.println("    4) choose {tovar name}");
        System.out.println("    5) buy");
        System.out.print("Enter a command: ");
    }

    private static void login() {
        isLogged = true;
        System.out.println("\nLogged successful\n");
    }

    private static void categories() {
        System.out.println("Folowing categories is available:");
        for (var i : Category.values()) {
            System.out.println("    " + i.name());
        }
        System.out.println();
    }

    private static void catalog() {
        String name = sc.next();
        Category c;
        try {
            c = Enum.valueOf(Category.class, name);
        }
        catch (Exception e){
            System.out.println("Unknown name\n");
            return;
        }
        switch (c) {
            case FRUIT:
                printCatalog(Fruit.class);
                break;
            case SPORT:
                printCatalog(Sport.class);
                break;
            case BOTTLE:
                printCatalog(Bottle.class);
                break;
        }
    }

    private static <T extends  Enum> void printCatalog(Class<T> clazz) {
        System.out.println("\nCatalog in " + clazz.getSimpleName());
        for (var i : clazz.getEnumConstants()) {
            System.out.println(i.name());
        }
        System.out.println();
    }

    private static void choose() {
        String name = sc.next();

        if (!isLogged) {
            System.out.println("Login to choose tovar\n");
            return;
        }

        var x = getEnum(Bottle.class, name);
        if (x != null) {
            System.out.println(x.name() + " added sucessful");
            korzina.add(x);
            return;
        }
        var y = getEnum(Fruit.class, name);
        if (y != null) {
            System.out.println(y.name() + " added sucessful");
            korzina.add(y);
            return;
        }
        var z = getEnum(Sport.class, name);
        if (z != null) {
            System.out.println(z.name() + " added sucessful");
            korzina.add(z);
            return;
        }
        System.out.println("Unknown tovar");
    }

    private static <T extends Enum> T getEnum(Class<T> clazz, String name) {
        for (var i : clazz.getEnumConstants()) {
            if (i.name().equals(name)) {
                return i;
            }
        }
        return null;
    }

    private static void buy() {
        System.out.println();
        for (var i : korzina) {
            System.out.println(i);
        }
        korzina.clear();
        System.out.println("All items were bought\n");
    }
}
