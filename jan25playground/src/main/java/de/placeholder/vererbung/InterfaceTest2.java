package de.placeholder.vererbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceTest2 {

    public static void main(String[] args) {

        // List ist ein Interface: Beschreibt, was eine Liste an Methoden haben muss.
        // ArrayList ist eine Klasse: Realisiert die benötigten Methoden.

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Scott");
        namen.add("Natasha");
        namen.add("Tony");

        System.out.println(namen);
        Collections.sort(namen);
        System.out.println(namen);

        System.out.println();

        List<SuperHero> heros = new ArrayList<>();
        heros.add(new SuperHero("Spiderman", "Peter", "Parker"));
        heros.add(new SuperHero("Black Widow", "Natasha", "Romanov"));
        heros.add(new SuperHero("Ant-Man", "Scott", "Lang"));
        heros.add(new SuperHero("Cap. Marvel", "Carol", "Danvers"));

        System.out.println(heros);

        System.out.println();

        Collections.sort(heros);

        for(SuperHero hero : heros) {
            System.out.println(hero);
        }

        // Comparable wird von einer Klasse implementiert und beschreibt
        // die natürliche Ordnung für Objekte dieser Klasse.

        // Comparator ist ein Vergleichsobjekt und kann mehrmals realisiert werden,
        // beschreibt verschiedene Sortierungs-Möglichkeiten für ein objekt.

        System.out.println();

        // Lambdaausdruck = Kurzschreibweise für eine Klasse.
        Comparator<SuperHero> nachVorname = (a, b) -> a.getRealFirstname().compareTo(b.getRealFirstname());
        Comparator<SuperHero> nachNachname = (a, b) -> a.getRealLastname().compareTo(b.getRealLastname());

        Collections.sort(heros, nachNachname);

        for(SuperHero hero : heros) {
            System.out.println(hero);
        }
    }
}

class NachNachnameComparator implements Comparator<SuperHero> {

    @Override
    public int compare(SuperHero o1, SuperHero o2) {
        return o1.getRealLastname().compareTo(o2.getRealLastname());
    }
}

class SuperHero implements Comparable<SuperHero> {

    private String name;
    private String realFirstname;
    private String realLastname;

    public SuperHero(String name, String realFirstname, String realLastname) {
        this.name = name;
        this.realFirstname = realFirstname;
        this.realLastname = realLastname;
    }

    public String getName() {
        return name;
    }

    public String getRealFirstname() {
        return realFirstname;
    }

    public String getRealLastname() {
        return realLastname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SuperHero{");
        sb.append("name='").append(name).append('\'');
        sb.append(", realFirstname='").append(realFirstname).append('\'');
        sb.append(", realLastname='").append(realLastname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // compareTo beschreibt die natürliche Ordnung: Standardsortierung.

    @Override
    public int compareTo(SuperHero other) {
//        this = dieses Objekt
//        this = andere Objekt
        return name.compareTo(other.name); // Vergleich auf basis des namens (String).
    }
}