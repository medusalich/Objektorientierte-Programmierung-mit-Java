package de.placeholder.uebung.u17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreibe den Dateinamen: ");
        String dateiname = scanner.nextLine();

        System.out.println("Schreiben oder Analysieren?");
        String auswahl = scanner.nextLine();

        if (!auswahl.equalsIgnoreCase("schreiben")) {
            List<String> stringList = readFromFile(dateiname);
            System.out.println("Suchwort eingeben: ");
            String suchWort = scanner.nextLine();
            int zaehler = 0;
            for (String zeile : stringList) {
                String[] aufsplitten = zeile.toLowerCase().trim().split(" ");
                for (String wort : aufsplitten) {
                    if (wort.equalsIgnoreCase(suchWort)) {
                        zaehler++;
                    }
                }
            }
            System.out.println("Das Wort " + suchWort + " kommt in der Datei " + dateiname + " " + zaehler + "x vor.");
        }
        else {
            System.out.println("Schreib etwas: ");
            String text = scanner.nextLine();
            saveToFile(dateiname, text);
        }
    }

    private static void saveToFile(String dateiname, String text) {
        try (FileWriter fw = new FileWriter(dateiname)) {
            fw.write(text + "\n");
        }
        catch (IOException e) {
            System.out.println("Daten konnten nicht gespeichert werden.");
        }
    }

    private static List<String> readFromFile(String dateiname) { //FileReadAllLines

        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader((new FileReader(dateiname)))) {
            String zeile;
            while ((zeile = br.readLine()) != null) {
                stringList.add(zeile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Daten konnten nicht rekonstruiert werden.");
        } catch (IOException e) {
            System.out.println("Lesen aus der Datei ist nicht möglich.");
        }
        return stringList;
    }

}
