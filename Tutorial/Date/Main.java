package Tutorial.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
    LocalDate ld = LocalDate.now();
    System.out.println(ld);
    LocalTime lt = LocalTime.now();
    System.out.println(lt);

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);

    
    DateTimeFormatter ldtFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = ldt.format(ldtFormatter);
    System.out.println("After formatting: " + formattedDate);
    }
}
