package de.placeholder;

public class VariablenTest2 {

    public static void main(String[] args) {

        int i1 = 10; // Variable: kann den Inhalt ändern
        final double PI = 3.14; // Konstante: kann den Inhalt NICHT ändern

        i1 = 12; //OK
        // PI = 10; //geht nicht!

        // Konkatenation: Irgendwas + String = IMMER String
        System.out.println("Hallo. Meine Zahl ist " + PI);

        System.out.println("#" + 10 + 2); // #102
        System.out.println("#" + 10 * 2); // #20
        System.out.println("#" + (10 + 2)); // #12
        System.out.println("#" + PI); //#3.14
        System.out.println("#" + i1); //#3.14

        // Unterstrich
        int _i; // Deklaration. Es wird kein Speicher reserviert
        // int _; // Ab Java 22 nicht mehr alleine als Bezeichner erlaubt
        int $ab; // OK
        // int 1ab; // Error: Darf nicht mit einer Zahl beginnen!

        System.out.println("Ende des Programms!");

    }
}
