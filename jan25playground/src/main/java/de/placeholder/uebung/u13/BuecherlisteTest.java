package de.placeholder.uebung.u13;

import java.util.Scanner;

public class BuecherlisteTest {

    private static final Scanner scanner = new Scanner(System.in);

    private static final Buecherliste buecherliste = new Buecherliste();

    public static void main(String[] args) {

        app: while(true) {
            System.out.println("Auswahl: ");
            switch (scanner.nextLine().trim().toLowerCase()) {
                case "neu" -> buchHinzufuegen();
                case "print verzeichnis" -> buecherliste.printVerzeichnis();
                case "print angelegt" -> buecherliste.printAngelegt();
                case "print ausgeliehen" -> buecherliste.printAusgeliehen();
                case "exit" -> {
                    break app;
                }
                default -> System.out.println("Falsche Auswahl!");
            }
        }
    }

    private static void buchHinzufuegen() {
        System.out.println("Neues Buch anlegen");
        System.out.println("Name des Autors: ");
        String autor = scanner.nextLine();
        System.out.println("Titel des Buches: ");
        String titel = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Erscheinungsjahr: ");
        int erscheinungsjahr = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Verlag: ");
        String verlag = scanner.nextLine();
        System.out.println("Buchgenre: ");
        String genre = scanner.nextLine();
        System.out.println("Seitenanzahl: ");
        int seitenanzahl = scanner.nextInt();
        scanner.nextLine();

        buecherliste.hinzufuegen(new Buch(autor, titel, isbn, erscheinungsjahr, verlag, genre, seitenanzahl));
        System.out.println("Buch wurde gespeichert");
    }
}