package de.placeholder;

public class Robot {

    private String name;
    private int x;
    private int y;

    public Robot(String name) {
        this.name = name;
        // x und y starten be 0
    }

    // Methodenparameter sind lokale Variablen
    public Robot(String name, int x, int y) {
        // name = lokale Variable
        // this.name = Instanz Eigenschaft
        this.name = name;
        this.x = x;
        this.y = y;
        // this muss verwendet werden, wenn Eigenschaften und lokale Variablen gleich heißen.
    }

    // public = Methode ist von überall verwendbar
    // void = Rückgabetyp. void heißt, es gibt keine Rückgabe
    // goUp = Name der Methode
    // () = Parameterklammer
    // {} = Alles innerhalb der Klammer gehört zu dieser Methode
    public void goUp() {
        x++;
    }

    public void goDown() {
        x--;
    }

    public void goLeft() {
        y--;
    }

    public void goRight() {
        y++;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
