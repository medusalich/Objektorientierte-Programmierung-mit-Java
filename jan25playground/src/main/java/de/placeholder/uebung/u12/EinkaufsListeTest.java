package de.placeholder.uebung.u12;

public class EinkaufsListeTest {

    public static void main(String[] args) {

        EinkaufsListe liste = new EinkaufsListe();

        liste.listeFuellen("Wurstbrot");
        liste.listeFuellen("Käsebrot");
        liste.listeFuellen("Nutellabrot");
        liste.listeFuellen("Eibrot");
        liste.listeFuellen("Marmeladenbrot");
        liste.listeFuellen("Bananenbrot");

        System.out.println(liste.listeAusgeben());
    }
}
