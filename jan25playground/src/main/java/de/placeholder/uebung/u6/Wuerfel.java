package de.placeholder.uebung.u6;

public class Wuerfel {

    public static int wuerfel() {

        int zahl = (int)(Math.random() * 6) + 1;
        return zahl;

    }

    public static int[] roll(int anzahl) {

        int[] array = new int[anzahl];

        for (int i = 0; i < array.length; i++) {
            array[i] = wuerfel();
        }
        return array;
    }
}
