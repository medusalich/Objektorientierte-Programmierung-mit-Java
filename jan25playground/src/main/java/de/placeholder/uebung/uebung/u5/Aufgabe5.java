package de.placeholder.uebung.uebung.u5;

public class Aufgabe5 {

    /*
    Gib alle Großbuchstaben aus.
     */
    public static void main(String[] args) {

//        int zeichen = 65;
//        System.out.println((char)zeichen);

        for(int zeichen = 65; zeichen <= 90; zeichen++) {
            System.out.println((char)zeichen);
        }

        System.out.println();

        int zeichen = 'A';
        do {
            System.out.println((char)zeichen);
            zeichen++;
        } while(zeichen <= 'Z'); // char wird automatisch in int umgewandelt

    }
}