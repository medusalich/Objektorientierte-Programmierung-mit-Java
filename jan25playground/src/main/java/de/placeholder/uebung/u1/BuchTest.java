package de.placeholder.uebung.u1;

public class BuchTest {

    public static void main(String[] args) {

        Buch b1 = new Buch("Das Kalendermädchen", "Sebastian Fitzek", 400, 25.50);
        b1.nenneTitelAutor();
        b1.nennePreis();
        b1.nenneSeitenanzahl();
        System.out.println(b1);

        Buch b2 = new Buch("Waffeln", "Angelika Ilies", 64, 12.99);
        b2.nenneTitelAutor();
        b2.nennePreis();
        b2.nenneSeitenanzahl();
        System.out.println(b2);

        Buch b3 = new Buch("Warrior Cats", "Erin Hunter", 320, 15);
        b3.nenneTitelAutor();
        b3.nennePreis();
        b3.nenneSeitenanzahl();
        System.out.println(b3);

        Buch b4 = new Buch("Die kleine Raupe Nimmersatt", "Eric Carle", 26, 12);
        b4.nenneTitelAutor();
        b4.nennePreis();
        b4.nenneSeitenanzahl();
        System.out.println(b4);

        Buch b5 = new Buch("Der Grüffelo", "Axel Scheffler und Julia Donaldson", 24, 11.50);
        b5.nenneTitelAutor();
        b5.nennePreis();
        b5.nenneSeitenanzahl();
        System.out.println(b5);

    }
}
