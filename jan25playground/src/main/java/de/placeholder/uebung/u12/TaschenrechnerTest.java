package de.placeholder.uebung.u12;

public class TaschenrechnerTest {

    public static void main(String[] args) {

        TaschenrechnerProtokolle.addieren(5, 4);
        TaschenrechnerProtokolle.addieren(8, 4);
        TaschenrechnerProtokolle.subtrahieren(5, 4);
        TaschenrechnerProtokolle.subtrahieren(8, 4);
        TaschenrechnerProtokolle.multiplizieren(5, 4);
        TaschenrechnerProtokolle.multiplizieren(8, 4);
        TaschenrechnerProtokolle.dividieren(5, 4);
        TaschenrechnerProtokolle.dividieren(8, 4);

        TaschenrechnerProtokolle.printProtokoll();
    }
}
