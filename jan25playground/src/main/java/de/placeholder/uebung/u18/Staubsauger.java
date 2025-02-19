package de.placeholder.uebung.u18;

public class Staubsauger {

    private int maxBeutelMin;
    private int maxAkkuMin;
    private int akkuMinuten;
    private int beutelMinuten;
    private boolean istEingeschaltet;

    public Staubsauger() {
        this.maxBeutelMin = 40;
        this.maxAkkuMin = 20;
        this.akkuMinuten = maxAkkuMin;
        this.beutelMinuten = maxBeutelMin;
    }


    public void einschalten() {
        if (!istEingeschaltet) {
            istEingeschaltet = true;
        }
    }

    public void ausschalten() {
        if (istEingeschaltet) {
            istEingeschaltet = false;
        }
    }

    public void saugen(int min) {
        if (!istEingeschaltet) {
            System.out.println("Sauger An?");
            return;
        }

        if (min <= 0) {
            return;
        }
        else if (min > akkuMinuten) {
            System.out.println("Du kannst noch " + akkuMinuten + " saugen. ");
//            min = akkuMinuten;
        }
        else if (min > beutelMinuten) {
            System.out.println("Du kannst noch " + beutelMinuten + " saugen. ");
//            min = beutelMinuten;
        }
        else {
            akkuMinuten -= min;
            beutelMinuten -= min;
            System.out.println("Du hast " + akkuMinuten + " Akku-Minuten und " + beutelMinuten + " Beutel-Minuten übrig.");
        }


    }

    public void akkuAufladen() {
        akkuMinuten = maxAkkuMin;
        System.out.println("Akku aufgeladen. Akku hält: " + akkuMinuten + " Minuten.");
    }

    public void beutelLeeren() {
        beutelMinuten = maxBeutelMin;
        System.out.println("Beutel geleert. Beutel hält: " + beutelMinuten + " Minuten.");
    }
}