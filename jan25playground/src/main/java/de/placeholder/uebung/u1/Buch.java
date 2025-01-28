package de.placeholder.uebung.u1;

public class Buch {

    public String titel;

    public String autor;

    public int seitenanzahl;

    public double preis;

    public Buch(String titel, String autor, int seitenanzahl, double preis) {
        this.titel = titel;
        this.autor = autor;
        this.seitenanzahl = seitenanzahl;
        this.preis = preis;
    }

    public void nenneTitelAutor() {
        System.out.println("Der Titel lautet " + titel + " und der dazugehörige Autor heißt " + autor);
    }

    public void nennePreis() {
        System.out.println("Der Preis von " + titel + " beträgt " + preis + "€");
    }

    public void nenneSeitenanzahl() {
        System.out.println("Die Seitenanzahl des Buches " + titel + " vom Autor " + autor + " beträgt " + seitenanzahl);
    }
}
