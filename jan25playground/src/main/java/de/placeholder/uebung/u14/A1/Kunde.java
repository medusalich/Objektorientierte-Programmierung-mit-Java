package de.placeholder.uebung.u14.A1;

import java.util.Objects;

public class Kunde {
    private String name;
    private String email;

    public Kunde(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kunde kunde = (Kunde) o;
        return Objects.equals(name, kunde.name) && Objects.equals(email, kunde.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    public static void main(String[] args) {

        Kunde kunde1 = new Kunde("Bruce", "bruce@example.com");
        Kunde kunde2 = new Kunde("Peter", "peter@example.com");
        System.out.println("Kundenvergleich: " + kunde1.equals(kunde2));
        System.out.println("Kunden Hashcode: " + (kunde1.hashCode() == kunde2.hashCode()));

        Film film1 = new Film("Avangers", "Action");
        Film film2 = new Film("Avangers", "Action");
        System.out.println("Filmvergleich: " + film1.equals(film2));
        System.out.println("Film Hashcode: " + (film1.hashCode() == film2.hashCode()));
    }
}





