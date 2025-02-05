package de.placeholder.arrays;

public class Array2dTest {

    public static void main(String[] args) {

        char[] arr1d = new char[10];
        arr1d[3] = 'X';
        arr1d[0] = 'A';

        //Array-Index wird erst zur Laufzeit geprüft
        //arr1d[12] = 'Z'; //ArrayIndexOutBoundsException
        //arr1d[-12] = 'Z'; //ArrayIndexOutBoundsException

        char[][] arr2d = new char[10][10];
        arr2d[2][3] = 'X';

        //Erste Schleife läuft das Array Reihe für Reihe durch
        for (char[] reihe : arr2d) {
            for(char sitz : reihe) { //Zweite Schleife läuft die Reihe Sitz für Sitz durch
                System.out.print("#" + sitz + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr2d.length; i++) {

            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.println(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        int[][][] arr3d;
        int[][][][] arr4d;
    }
}
