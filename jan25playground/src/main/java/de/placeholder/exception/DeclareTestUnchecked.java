package de.placeholder.exception;

public class DeclareTestUnchecked {

    public static void main(String[] args) {
        // Wenn eine Runtime-Exception bis zum Ende der MAin-Methode nicht behandelt wurde,
        // wird das Programm abgebrochen.
        try {
            machWasAnderes();
        }
        catch (RuntimeException e) {
            System.out.println("Problem in main.");
        }
    }

    private static void machWasAnderes() {
//        try {
            machWas();
//        }
//        catch (RuntimeException e) {
//            System.out.println("Problem in machWasAnderes().");
//        }
    }

    // Wird eine RuntimeException in einer Methode nicht behandelt,
    // steigt sie automatisch im Methoden-Stack nach oben.
    // D.h. die Exception taucht beim Aufrufer der Methode auf.
    private static void machWas() {
//        try {
        String name = null;
        System.out.println(name.toUpperCase()); // NullPointerException
//        }
//        catch (RuntimeException e) {
//            System.out.println("Problem in machWas().");
//        }
    }
}
