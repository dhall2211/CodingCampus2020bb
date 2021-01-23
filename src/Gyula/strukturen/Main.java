package Gyula.strukturen;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        vectorExample();
        arrayListExample();
        linkedListExample();
        queueExample();
        stackExample();
        hashSetExample();
        hashMapExample();
    }

    private static void vectorExample(){
        // Thread Safe, basiert auf Array und dynamisch erweiterbar
        System.out.println("========================================");
        System.out.println("  Vector<E>");
        Vector<String> namen = new Vector<>();
        namen.add("Ali");
        namen.add("Irene");
        namen.add("Bokhee");
        namen.add("Gyula");
        namen.remove("Gyula");
        System.out.println("Ist Samet da? " + namen.contains("Samet"));

        for (String name: namen) {
            System.out.println("Name: " + name);
        }
        for (int i = 0; i < namen.size(); i++) {
            System.out.println("Name: " + namen.get(i));
        }

        System.out.println(namen);
    }

    private static void arrayListExample(){
        // NICHT Thread Safe, basiert auf Array und dynamisch erweiterbar
        System.out.println("========================================");
        System.out.println("  ArrayList<E>");
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Ali");
        namen.add("Irene");
        namen.add("Bokhee");
        namen.add("Gyula");
        namen.remove("Gyula");
        System.out.println("Ist Samet da? " + namen.contains("Samet"));

        for (String name: namen) {
            System.out.println("Name: " + name);
        }
        for (int i = 0; i < namen.size(); i++) {
            System.out.println("Name: " + namen.get(i));
        }

        System.out.println(namen);
    }


    private static void linkedListExample(){
        // basiert auf "das Nächste", geeignet zu element zufügen und dynamisch erweiterbar
        System.out.println("========================================");
        System.out.println("  LinkedList<E>");
        LinkedList<String> namen = new LinkedList<>();
        namen.add("Ali");
        namen.add("Irene");
        namen.add("Bokhee");
        namen.add("Gyula");
        namen.remove("Gyula");
        System.out.println("Ist Samet da? " + namen.contains("Samet"));

        for (String name: namen) {
            System.out.println("Name: " + name);
        }
        for (int i = 0; i < namen.size(); i++) {
            System.out.println("Name: " + namen.get(i));
        }

        System.out.println(namen);
    }



    private static void queueExample(){
        // FirstInFirstOut, Thread Safe, dynamisch erweiterbar
        System.out.println("========================================");
        System.out.println("  PriorityQueue<E>");
        PriorityQueue<String> namen = new PriorityQueue<>();
        PriorityQueue<String> klassenListe = new PriorityQueue<>();
        namen.add("Ali");
        namen.add("Irene");
        namen.add("Bokhee");
        namen.add("Gyula");
        namen.remove("Gyula");
        System.out.println("Ist Samet da? " + namen.contains("Samet"));

        // Hält die Elementen dabei (nicht als Queue behandelt)
        for (String name: namen) {
            System.out.println("Name: " + name);
        }
        // Als Queue Elment nach Element aufarbeiten
        while (namen.size() > 0){
            String name = namen.poll();
            System.out.println("Name: " + name);
            klassenListe.add(name);
        }

        System.out.println(namen);
        System.out.println(klassenListe);
    }


    private static void stackExample(){
        // LastInFirstOut, Thread Safe, dynamisch erweiterbar
        System.out.println("========================================");
        System.out.println("  Stack<E>");
        Stack<String> namen = new Stack<>();
        namen.push("Ali");
        namen.push("Irene");
        namen.push("Bokhee");
        namen.push("Gyula");
        namen.remove("Gyula");
        System.out.println("Ist Samet da? " + namen.contains("Samet"));

        for (String name: namen) {
            System.out.println("Name: " + name);
        }
        // Als Queue Elment nach Element aufarbeiten
        while (namen.size() > 0){
            String name = namen.pop();
            System.out.println("Name: " + name);
        }

        System.out.println(namen);
    }


    private static void hashSetExample(){
        // Alles ist einmalig, Rheienfolge ist nicht bekannt, Thread Safe, dynamisch erweiterbar
        System.out.println("========================================");
        System.out.println("  HashSet<E>");
        HashSet<String> namen = new HashSet<>();
        namen.add("Ali");
        namen.add("Ali");
        namen.add("Ali");
        namen.add("Ali");
        namen.add("Ali");
        namen.add("Irene");
        namen.add("Bokhee");
        namen.add("Gyula");
        namen.add("Gyula");
        namen.add("Gyula");
        namen.remove("Gyula");
        System.out.println("Ist Samet da? " + namen.contains("Samet"));

        for (String name: namen) {
            System.out.println("Name: " + name);
        }

        System.out.println(namen);
    }


    private static void hashMapExample(){
        // Sclüssel-Wert Paare, Thread Safe, dynamisch erweiterbar
        System.out.println("========================================");
        System.out.println("  HastMap<K,S>");
        HashMap<String, Integer> schulnoten = new HashMap<>();
        schulnoten.put("Ali", 5);
        schulnoten.put("Bokhee", 1);
        schulnoten.put("Bokhee", 2); // Wert überschreiben
        schulnoten.put("Irene", 100);
        schulnoten.put("Gyula", -1);
        schulnoten.remove("Gyula");
        System.out.println("Ist Samet da? " + schulnoten.containsKey("Samet"));
        System.out.println("Hat einer eine 100 " + schulnoten.containsValue(100));

        for (String name: schulnoten.keySet()) {
            System.out.println("Name: " + name + " Note: " + schulnoten.get(name));
        }

        System.out.println(schulnoten);
    }


}
