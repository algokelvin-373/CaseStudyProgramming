package javacase.Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetTimeNow {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Get Time Now: "+ dtf.format(now));
    }
}
