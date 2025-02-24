package de.placeholder.uebung.u20;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Einstiegspunkt für das Programm.
 * Sie enthält die main-Methode, die die Zeiterfassung initialisiert
 * und die Methode zur Erfassung der Zeit aufruft.
 */
public class Aufgabe2 {

    public static void main(String[] args) {

        Zeiterfassung zeiterfassung = Zeiterfassung.INSTANCE;

        zeiterfassung.zeitErfassen();

    }
}

/**
 * Enum Zeiterfassung implementiert eine Singleton-Instanz zur Zeiterfassung.
 * Es ermöglicht das Starten, Pausieren und Beenden der Zeitmessung.
 */
enum Zeiterfassung {
    INSTANCE;

    static Scanner scanner = new Scanner(System.in);

    private LocalDateTime start = null;
    private LocalDateTime start_pause = null;
    private LocalDateTime ende_pause;
    private LocalDateTime ende;
    private long pausenMinuten = 0;

    /**
     * Startet die Zeiterfassung und ermöglicht dem Benutzer, Eingaben zu tätigen,
     * um die Zeitmessung zu steuern.
     */
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

    /**
     * Startet die Zeiterfassung.
     * Wenn die Zeiterfassung bereits gestartet ist, wird eine entsprechende Nachricht ausgegeben.
     */
    public void startZeiterfassung() {
        if (start == null) {
            start = LocalDateTime.now();
            System.out.println("Zeiterfassung gestartet.");
        } else {
            System.out.println("Zeiterfassung schon gestartet.");
        }
    }

    /**
     * Startet eine Pause der Zeiterfassung.
     * Wenn die Pause bereits gestartet ist oder die Zeiterfassung nicht gestartet wurde,
     * wird eine entsprechende Nachricht ausgegeben.
     */
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

    /**
     * Beendet die Pause der Zeiterfassung.
     * Berechnet die Dauer der Pause und addiert sie zu den pausierten Minuten.
     * Wenn keine Pause aktiv ist, wird eine entsprechende Nachricht ausgegeben.
     */
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

    /**
     * Beendet die Zeiterfassung.
     * Berechnet die Gesamtzeit unter Berücksichtigung der Pausen und gibt das Ergebnis aus.
     * Wenn die Zeiterfassung nicht gestartet wurde oder eine Pause aktiv ist,
     * wird eine entsprechende Nachricht ausgegeben.
     */
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

