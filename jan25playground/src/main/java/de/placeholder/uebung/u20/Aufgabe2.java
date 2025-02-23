package de.placeholder.uebung.u20;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {

        Zeiterfassung zeiterfassung = Zeiterfassung.INSTANCE;

        zeiterfassung.zeitErfassen();

    }
}

enum Zeiterfassung {
    INSTANCE;

    static Scanner scanner = new Scanner(System.in);

    private LocalDateTime start = null;
    private LocalDateTime start_pause = null;
    private LocalDateTime ende_pause;
    private LocalDateTime ende;
    private long pausenMinuten = 0;

    public void zeitErfassen() {
        while (true) {
            System.out.println("Eingabe (start, start pause, ende pause, ende, exit): ");
            String eingabe = scanner.nextLine().trim().toLowerCase();

            switch (eingabe) {
                case "s":
                case "start":
                    startZeiterfassung();
                    break;
                case "sp":
                case "start pause":
                    startPause();
                    break;
                case "ep":
                case "ende pause":
                    endePause();
                    break;
                case "e":
                case "ende":
                    endeZeiterfassung();
                    break;
                case "exit":
                    System.out.println("Programm beendet.\n");
                    return;
                default:
                    System.out.println("Ungültige Eingabe!\n");
            }
        }
    }

    public void startZeiterfassung() {
        if (start == null) {
            start = LocalDateTime.now();
            System.out.println("Zeiterfassung gestartet.");
        } else {
            System.out.println("Zeiterfassung schon gestartet.");
        }
    }

    public void startPause() {
        if (start_pause == null && start != null) {
            start_pause = LocalDateTime.now();
            System.out.println("Pause gestartet.");
        } else if (start_pause != null) {
            System.out.println("Pause bereits gestartet!");
        } else {
            System.out.println("Zeiterfassung muss zuerst gestartet werden!");
        }
    }

    public void endePause() {
        if (start_pause != null) {
            ende_pause = LocalDateTime.now();
            Duration duration = Duration.between(start_pause, ende_pause);
            long pausenZeit = duration.toMinutes();
            pausenMinuten += pausenZeit;
            start_pause = null;
            System.out.println("Pause beendet.");
        } else {
            System.out.println("Pause muss zuerst gestartet werden!");
        }
    }

    public void endeZeiterfassung() {
        if (start != null && start_pause == null) {
            ende = LocalDateTime.now();
            Duration duration = Duration.between(start, ende);
            long minuten = duration.toMinutes();
            long gesamtZeit = minuten - pausenMinuten;
            long stunden = gesamtZeit / 60;
            minuten %= 60;
            System.out.printf("Zeiterfassung beendet. " +
                    "Es waren %d Stunden und %d Minuten.\n", stunden, minuten);
            start = null;
        } else if (start_pause != null) {
            System.out.println("Pause muss erst beendet werden!");
        } else {
            System.out.println("Zeiterfassung muss zuerst gestartet werden!");
        }
    }
}

