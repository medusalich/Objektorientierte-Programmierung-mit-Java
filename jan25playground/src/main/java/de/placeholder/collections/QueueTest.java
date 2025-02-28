package de.placeholder.collections;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class QueueTest {

    public static void main(String[] args) {

        Server server = new Server();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Nachricht: ");
            String eingabe = scanner.nextLine();

            if (eingabe.equalsIgnoreCase("exit")) break;

            server.createMessage(eingabe);
        }

        System.out.println("Programm beendet.");
        server.stop();
    }
}

class Server {

    private final Queue<Nachricht> nachrichten = new LinkedList<>();

    // Führt aufgaben in regelmäßigen abständen aus.
    private final ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);

    public Server() {
        // Führt die Aufgabe alle 5 Sekunden aus.
        pool.scheduleAtFixedRate(() -> sendMessage(), 0, 5, TimeUnit.SECONDS);
    }

    private void sendMessage() {
        // Entnimmt eine Nachricht aus der Queue.
        Nachricht n = nachrichten.poll();
        if(n != null)
            System.out.println("\nVERSCHICKT: " + n);
    }

    private void createMessage(String text) {
        nachrichten.offer(new Nachricht(text));
    }

    public void stop() {
        // Abarbeitung des Aufgaben-Pools wird gestoppt.
        pool.shutdown();
    }
}

class Nachricht {

    private final String text;
    private final LocalDateTime createdAt;

    public Nachricht(String text) {
        this.text = text;
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return createdAt + " > " + text;
    }
}
