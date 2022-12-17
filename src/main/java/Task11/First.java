package Task11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class First {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2022, Calendar.SEPTEMBER, 1);

        System.out.println("Task received elyutin-%d:%d:%d" + c1.get(Calendar.YEAR) + " " + c1.get(Calendar.MONTH));
        System.out.println("Task completed elyutin-" + Calendar.getInstance());
    }
}
