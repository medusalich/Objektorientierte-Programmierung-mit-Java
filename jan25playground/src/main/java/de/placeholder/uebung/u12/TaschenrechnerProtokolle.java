package de.placeholder.uebung.u12;

public class TaschenrechnerProtokolle {

    private static final StringBuilder protokoll = new StringBuilder();

    public static void printProtokoll() {
        System.out.println(protokoll);
    }

    public static double addieren(double zahl1, double zahl2){
        double summe = zahl1 + zahl2;
        protokoll.append(zahl1).append(" + ").append(zahl2).append(" = ").append(summe).append("\n");
        return summe;
    }

    public static double subtrahieren(double zahl1, double zahl2){
        double differenz = zahl1 - zahl2;
        protokoll.append(zahl1).append(" - ").append(zahl2).append(" = ").append(differenz).append("\n");
        return differenz;
    }

    public static double multiplizieren(double zahl1, double zahl2){
        double produkt = zahl1 * zahl2;
        protokoll.append(zahl1).append(" * ").append(zahl2).append(" = ").append(produkt).append("\n");
//        protokoll.append(String.format("%.1f * %.1f = %s \n", zahl1, zahl2, produkt));
        return produkt;
    }

    public static double dividieren(double zahl1, double zahl2){
        double quotient = zahl1 / zahl2;
        protokoll.append(zahl1).append(" / ").append(zahl2).append(" = ").append(quotient).append("\n");
        return quotient;
    }
}
