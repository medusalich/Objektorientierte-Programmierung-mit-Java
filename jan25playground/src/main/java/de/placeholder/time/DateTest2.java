package de.placeholder.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DateTest2 {

    public static void main(String[] args) {

        // Abstand

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2026, 7, 22);

        Period abstand = ld1.until(ld2); // Liefert eine Period = Abstand zwischen zwei Zeitpunkten.
        System.out.println(abstand);
        System.out.println(abstand.getYears() + " Jahre.");
        System.out.println(abstand.getMonths() + " Monate.");
        System.out.println(abstand.getDays() + "Tage.");

        System.out.println();

        System.out.println(ld1.until(ld2, ChronoUnit.DAYS) + " Tage."); // Abstand als long in Tagen.

        // UnsupportedTemporalTypeException = LocalDate arbeitet nicht mit Nanos(LocalTime oder LocalDateTime möglich).
//        System.out.println(ld1.until(ld2, ChronoUnit.NANOS) + " Nanos.");

        System.out.println(Period.between(ld1, ld2));

        Instant start = Instant.now(); // Maschinenzeit in Nanos.

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        System.out.println();
        Instant ende = Instant.now();

        // Abstand in Maschinenzeit
        Duration vergangen = Duration.between(start, ende);
        System.out.println(vergangen.toNanos() + " ns"); // Abstand in Nanos.
    }
}
