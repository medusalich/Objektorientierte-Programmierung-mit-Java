package de.placeholder.uebung.u8;

public class Spielfeld {

    private String[][] arr2d = new String[20][20];

    private int x;
    private int y;

    public Spielfeld() {
        arr2d[x][y] = "@";
    }

    public void nachLinks(){
        arr2d[x][y] = null;
        y--;
        if(y < 0) y = 0;
        arr2d[x][y] = "@";
    }

    public void nachRechts(){
        arr2d[x][y] = null;
        y++;
        if(y == 20) y = 19;
        arr2d[x][y] = "@";
    }

    public void nachOben() {
        arr2d[x][y] = null;
        x--;
        if(x < 0) x = 0;
        arr2d[x][y] = "@";
    }

    public void nachUnten() {
        arr2d[x][y] = null;
        x++;
        if(x == 20) x = 19;
        arr2d[x][y] = "@";
    }

    public void print() {
        for (String[] reihe : arr2d) {
            for (String feld : reihe) {
                if (feld == null) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" " + feld + " ");
                }
            }
            System.out.println();
        }
    }
}
