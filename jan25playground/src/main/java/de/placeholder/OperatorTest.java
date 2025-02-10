package de.placeholder;

public class OperatorTest {

    public static void main(String[] args) {

        // Operatoren

        // Mathematische: + - * / %
        System.out.println(1 * 15);

        // Zuweisung: = += *= etc.
        int x = 100;
        x += 17;

        // Relational: == != < > <= >=
        // Erg. ist immer boolean
        System.out.println(10 == 15); //false
        System.out.println(10 != 15); //true

        // Logische:
        x= 10;
        System.out.println(x > 0 && x < 200); // Ist x größer 0 und ist x kleiner als 200
        System.out.println(x > 0 || x > 200); // Ist x größer 0 oder ist x größer als 200

        /*
        XOR = ^ Exclusiv-ODER
        AND = &&
        OR = ||

        | a | b | a AND b | a OR b | a XOR b |
        | 1 | 0 |    0    |    1   |    1    |
        | 1 | 1 |    1    |    1   |    0    |
        | 0 | 1 |    0    |    1   |    1    |
        | 0 | 0 |    0    |    0   |    0    |
        */

        // Ternärer Operator
        //           Bedingung         Wahr                 Sonst
        String text = (x > 0)? "Ist größer als 10" : "Ist kleiner als 10";
        System.out.println(text);

        System.out.println();

        x = 5;
        System.out.println("Wert ist " + ((x > 10) ? "größer" : "kleiner") + " als 10");


        System.out.println();

        String txt; // Deklaration
        if(x > 10) {
            txt = "Ist größer als 10"; // Zuweisung
        }
        else {
            txt = "Ist kleiner als 10";
        }
        System.out.println(txt);
    }
}