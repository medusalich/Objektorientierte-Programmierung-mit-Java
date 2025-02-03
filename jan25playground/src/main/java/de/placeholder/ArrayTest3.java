package de.placeholder;

public class ArrayTest3 {

    public static void main(String[] args) {

        int neueZahl = andereZahl(20);
        System.out.println(neueZahl);

        int[] zahlen = machWasGanzAnderes();
        System.out.println(zahlen[3]);

        //Name der anderen Klasse und danach die Klassenmethode (static)
        AndereKlasse.printHallo();

    }

    //Variable Zahl wird beim Aufruf durch den konkreten Parameter ersetzt.
    //void = Methode gibt NICHTS zurück.
    //int (oder ein anderer Datentyp) = Methode gibt einen Wert zurück.
    public static int andereZahl(int zahl) {
        if (zahl < 0) {
            return 0;
        }
        else {
            return zahl * zahl; //Das wird an den Aufrufer zurückgegeben.
        }
    }

    public static void machWasAnderes() {

        int count = 0;

        while(true){
            count++;

            if(count == 1000) return; //return ohne Wert verlässt eine Methode ohne Rückgabetyp (void).
        }
    }

    public static int[] machWasGanzAnderes() {
        //Mehrere Werte müssen erstmal verpackt werden, damit sie zusammen zurückgegeben werden können
        return new int[]{1, 2, 5, 7};
    }
}
