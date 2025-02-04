package de.placeholder.uebung.u7;

import de.placeholder.uebung.u7.Produkte;

import java.util.Random;

public class ProduktFaker {

    public static Produkte[] fake(int anzahlProdukte) {

        String[] namen = {
                "Fisch", "Fuchs", "Katze", "Wal", "Elefant",
                "Hund", "Hirsch", "Kamel", "Huhn", "Igel"
        };

        String[] beschreibungen = {
                "Meerestier", "Waldtier", "Haustier", "Meerestier",
                "Landtiere", "Haustier", "Waldtier", "Wüstentier",
                "Haustier", "Waldtier"
        };

        double[] preise = {
                123.0, 234.1, 345.2, 456.3, 567.4,
                678.5, 789.6, 891.7, 912.8, 123.9
        };

        Produkte[] arr = new Produkte[anzahlProdukte];
        for (int i = 0; i < anzahlProdukte; i++) {
            Random rand = new Random();
            int zahl = rand.nextInt(10); //0...9
            String name = namen[zahl];
            zahl = rand.nextInt(10);
            String beschreibung = beschreibungen[zahl];
            zahl = rand.nextInt(10);
            double preis = preise[zahl]; //Auf ein Element einer Liste zugreifen
            Produkte p1 = new Produkte(name, beschreibung, preis);
            arr[i] = p1;


        }
        return arr;
    }


}
