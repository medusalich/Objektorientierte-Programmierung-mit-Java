package de.placeholder.arrays;

import java.util.Scanner;

public class Todos {

    // Soll eine Variable in allen Klassen-Methoden verfügbar sein, dann muss sie
    // als Klassen-Variable deklariert sein.

    // Variablen außerhalb der Methoden, die NICHT static sind, sind Instanzvariablen.
    // Sie gehören einem Objekt. Vor der Benutzung muss new zuerst ein Objekt erzeugt werden.

    // private = Diese Variable ist nur INNERHALB dieser Klasse sichtbar.
    // static = Diese Variable gehört der Klasse.
    // finale = Variable kann sich nicht ändern.
    // int = Datentyp
    // SIZE = Variablenname
    private static final int SIZE = 10; // Klassenvariable: Scope: In allen Methoden dieser Klasse sichtbar.

    // Es bleibt IMMER ein String-Array mit Größe 10, Inhalt darf sich ändern.
    private static String[] todos = new String[SIZE]; //Array mit 10 Postionen.

    private static int next = 0;

    private static Scanner scanner = new Scanner(System.in);

    private static final String KEYS = "\n***************************************************************" +
                                       "\n\t create: Neues Todo " +
                                       "\n\t print: Todos anzeigen " +
                                       "\n\t help: Hilfe " +
                                       "\n\t exit: Programm verlassen " +
                                       "\n***************************************************************";


    public static void main(String[] args) {

        // final int SIZE = 10; // Lokale Konstante: Scope = nur die Main-Methode

        System.out.println(KEYS);

        app: while(true) { // Endlosschleife

            System.out.println("\nAuswahl: ");
            String auswahl = scanner.nextLine().toLowerCase();
            switch(auswahl){
                case "create" -> createTodo();
                case "print" -> printTodos();
                case "help" -> System.out.println(KEYS);
                case "exit" -> {
                    break app; // bricht die while-Schleife ab
                }
                default -> System.out.println("Falsche Eingabe!");
            }
        }
        System.out.println("Ende!");
    }

    private static void createTodo(){

        if(next == todos.length) {
            System.out.println("Todolist ist voll!");
            // break; //Ist für Schleifen und switch gedacht
            return; // Abbrechen, wenn das Array voll ist.
        }


        System.out.print("\nTodo: ");
        String eingabe = scanner.nextLine(); // Liest die ganze Zeile ein ikl. Leerzeichen
        todos[next] = eingabe; // Wert von der Konsole wird im Array auf der Position 0 abgelegt.

        // TODO: Daten in eine Datei speichern

        // Die Position für das nächste Todo um 1 hochzählen
        next++; // Hier kann prefix (++next) oder postfix (next++) benutzt werden
            /*
            Array
            0: <--- Hier
            1: null
            2: null
            3: null
            4: null
            5: null
            6: null
            7: null
            8: null
            9: null
             */
    }

    private static void printTodos() {
        System.out.println("\nDeine Todos: ");
        for(String todo : todos) { // todos = Klassenvariable
            if(todo != null) // Nur ausgeben, wenn nicht null.
                System.out.println(todo);
        }
    }
}
