package de.placeholder.uebung.u7;

import de.placeholder.uebung.u7.ProduktFaker;
import de.placeholder.uebung.u7.Produkte;

public class ProduktFakerTest {

    public static void main(String[] args) {

        Produkte[] p1 = de.placeholder.uebung.u7.ProduktFaker.fake(10);
        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i]);
        }
    }
}
