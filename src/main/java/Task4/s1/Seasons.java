package Task4.s1;

public class Seasons {

    public static void main(String[] args) {
        Season mySeason = Season.SUMMER;
        System.out.println("My favourite season is " + mySeason);

        System.out.println();

        infoForSeason(mySeason);

        System.out.println();

        System.out.println(mySeason.getDescription());

        for (var i : Season.values()) {
            System.out.println(i.averageTemperature + " " + i.name() + " " + i.getDescription());
        }
    }

    private static void infoForSeason (Season season) {
        System.out.print("I like ");
        switch (season) {
            case SUMMER:
                System.out.println("summer");
                break;
            case AUTUMN:
                System.out.println("autumn");
                break;
            case WINTER:
                System.out.println("winter");
                break;
            case SPRING:
                System.out.println("spring");
        }
    }
}
