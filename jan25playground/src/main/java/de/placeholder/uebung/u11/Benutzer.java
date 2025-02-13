package de.placeholder.uebung.u11;

public class Benutzer {

    private String name;
    private int alter;
    private double gewicht;
    private double groesse;

    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
    }

    public void setAlter(int alter) {
        if (alter >= 0 && alter <= 100) this.alter = alter;
    }

    public void setGewicht(double gewicht) {
        if (gewicht >= 0) this.gewicht = gewicht;
    }

    public void setGroesse(double groesse) {
        if (groesse >= 0) {
            this.groesse = groesse;
        }
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getGroesse() {
        return groesse;
    }

    public Benutzer(String name, int alter) {
        this (name, alter, 70, 170);
    }

    public Benutzer(String name, int alter, double gewicht, double groesse) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public double berechneBMI() {
        return gewicht / Math.pow(groesse / 100, 2);
    }

    public String gesundheitsEmpfehlung(){
        double bmi = berechneBMI();
        if (bmi > 0 && bmi < 18.5) {
            return "\nUntergewicht – Besprechen Sie Ihre Ziele mit einem Ernährungsberater.";
        }
        else if (bmi < 25) {
            return "\nNormalgewicht – Gute Arbeit, weiter so!";
        }
        else if (bmi < 29.9) {
            return "\nÜbergewicht – Ein moderates Trainingsprogramm wäre empfehlenswert.";
        }
        else {
            return "\nAdipositas – Professionelle Unterstützung könnte helfen, die Gesundheitsziele zu erreichen.";
        }
    }

    public String gesundheitsEmpfehlung(boolean erweiterteEmpfehlung) {
        if (erweiterteEmpfehlung) {
            if (alter > 0 && alter < 18) {
                return "\nDa Sie unter 18 sind, sollten Sie Ihr Wachstum und Ihre Entwicklung berücksichtigen.";
            }
            else if (alter < 30) {
                return "\nIn Ihrem Alter sind regelmäßige Bewegung und eine ausgewogene Ernährung besonders wichtig.";
            }
            else if (alter < 50) {
                return "\nHalten Sie ein ausgewogenes Verhältnis von Bewegung und Ernährung, um langfristig fit zu bleiben.";
            }
            else {
                return "\nRegelmäßige Bewegung zur Gelenkgesundheit ist besonders wichtig.";
            }
        }
        return "";
    }
}
