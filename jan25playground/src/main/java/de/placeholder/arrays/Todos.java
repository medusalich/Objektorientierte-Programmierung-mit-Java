package de.placeholder.arrays;

import java.util.Scanner;

public class Todos {

    private static final int SIZE = 10; //Klassenvariable: Scope: In allen Methoden dieser Klasse sichtbar.

    private static String[] todos = new String[SIZE]; //Array mit 10 Postionen.

    private static int next = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // final int SIZE = 10; //Lokale Konstante: Scope = nur die Main-Methode

        while(true) { //Endlosschleife
            if(next == todos.length) {
                System.out.println("Todolist ist voll!");
                break; //Abbrechen, wenn das Array voll ist.
            }

            createTodo();

            printTodos(); //Array Ausgaben
        }

    }

    private static void createTodo(){
        System.out.println("Todo: ");
        String eingabe = scanner.nextLine(); //Liest die ganze Zeile ein ikl. Leerzeichen.
        todos[next] = eingabe; //Wert von der Konsole wird im Array auf der Position 0 abgelegt.
        next++; //Hier kann prefix (++next) oder postfix (next++) benutzt werden.

            /*
            Array
            0: <--- HIer
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
        for(String todo : todos) { //todos = Klassenvariable
            if(todo != null) //
                System.out.println(todo);
        }
    }
}
