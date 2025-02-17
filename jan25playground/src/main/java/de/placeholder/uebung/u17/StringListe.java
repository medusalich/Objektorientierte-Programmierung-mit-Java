package de.placeholder.uebung.u17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringListe {

    private static final String FILE = "Strings.txt";

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList = readFromFile();
            for(String str : stringList) {
            System.out.println(str);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreibe etwas: ");
        String str = scanner.nextLine();

        stringList.add(str);

        saveToFile(stringList);
    }

    private static void saveToFile(List<String> stringList) {
        try(FileWriter fw = new FileWriter(FILE)){
            for (String zeile : stringList) {
                fw.write(zeile + "\n");
            }
        }
        catch (IOException e) {
            System.out.println("Daten konnten nicht gespeichert werden.");
        }
    }

    private static List<String> readFromFile() {

        List<String> stringList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader((new FileReader(FILE)))) {
            String zeile;
            while ((zeile = br.readLine()) != null) {
                stringList.add(zeile);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Daten konnten nicht rekonstruiert werden.");
        }
        catch (IOException e) {
            System.out.println("Lesen aus der Datei ist nicht möglich.");
        }
        return stringList;
    }
}