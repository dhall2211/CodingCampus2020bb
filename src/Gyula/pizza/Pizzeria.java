package Gyula.pizza;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Pizzeria {
    private String name;
    private Vector<Pizza> pizzaSorten;
    private Vector<Zutat> zutaten;

    public Pizzeria(String name){
        this.name = name;
        pizzaSorten = new Vector<>();
        zutaten = new Vector<>();
    }

    public void addPizza(Pizza p){
        pizzaSorten.add(p);
    }

    public void addZutat(Zutat z){
        zutaten.add(z);
    }

    public void addZutat(Zutat[] vieleZutaten){
        for (Zutat z: vieleZutaten) {
            zutaten.add(z);
        }
    }

    public void ordnenMenuUndZutaten(){
        pizzaSorten.sort(new Comparator<Pizza>() {
            @Override
            public int compare(Pizza o1, Pizza o2) {
                return o1.getId() - o2.getId();
            }
        });

        zutaten.sort(new Comparator<Zutat>() {
            @Override
            public int compare(Zutat o1, Zutat o2) {
                return o1.getId() - o2.getId();
            }
        });
    }


    public void bestellen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Name für die Lieferung ein:");
        String bestellerName = sc.nextLine();

        Vector<Pizza> bestellung = new Vector<>();
        pizzaBestellen(bestellung);
        bestellungBestaetigen(bestellung);
    }


    private void pizzaBestellen(Vector<Pizza> bestellung){
        Scanner sc = new Scanner(System.in);
        int pizzaID = Integer.MIN_VALUE;
        do {
            if (bestellung.size() == 0) {
                System.out.println("Welche Pizza darf ich schicken?");
            } else {
                System.out.println("Was darf noch sein?");
            }
            for (Pizza p : pizzaSorten) {
                System.out.println("    " + String.format("%2d", p.getId()) +
                        " " + String.format("%20s", p.getName()) +
                        " " + String.format("%5.2f€", p.getPreis()));
            }
            System.out.println();
            System.out.println("     0     Das wars alles.");

            Pizza pizza = null;
            do {
                String line = sc.nextLine();
                try {
                    pizzaID = Integer.valueOf(line);
                    if (pizzaID != 0) {
                        for (Pizza p : pizzaSorten) {
                            if (p.getId() == pizzaID) {
                                pizza = new Pizza(p);
                            }
                        }
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Sie müssen ein Pizza auswählen. Bitte geben Sie ihre wahl noch einmal.");
                }
            } while ((pizzaID != 0) && (pizza == null));
            if (pizza != null) {
                bestellung.add(pizza);
                zutatenAuswaehlen(pizza);
            }
        } while (pizzaID != 0);
    }

    private void zutatenAuswaehlen(Pizza p){
        Scanner sc = new Scanner(System.in);
        int zutatID = Integer.MIN_VALUE;
        do {
            System.out.println("Welche weitere Extras darf ich zum Pizza geben?");
            for (Zutat z: zutaten) {
                System.out.println("    " + String.format("%2d", z.getId()) +
                        " " + String.format("%20s", z.getName()));
            }
            System.out.println();
            System.out.println("     0     Keine weitere Extras bitte");

            Zutat zutat = null;
            do {
                String line = sc.nextLine();
                try {
                    zutatID = Integer.valueOf(line);
                    if (zutatID != 0) {
                        for (Zutat z : zutaten) {
                            if (z.getId() == zutatID) {
                                zutat = z;
                            }
                        }
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Sie müssen ein Zutat auswählen. Bitte geben Sie ihre wahl noch einmal.");
                }
            } while ((zutatID != 0) && (zutat == null));
            if (zutat != null) {
                p.addZutat(zutat);
            }
        } while (zutatID != 0);
        System.out.println("Ihre Pizza ist fertig");
        System.out.println(p.getName() + " " + p.getTotalPreis());
    }


    private void bestellungBestaetigen(Vector<Pizza> bestellung){
        System.out.println("Ihre Bestellung wäre:");
        float rechnung = 0.0f;
        for (Pizza p : bestellung){
            System.out.println("Pizza: " + p.getName());
            rechnung += p.getTotalPreis();
        }
        System.out.println("Total: " + String.format("%5.2f€", rechnung));
        Scanner sc = new Scanner(System.in);
        String bestaetigung = "";
        do {
            System.out.println("Passt es so? (J/N)");
            bestaetigung = sc.nextLine();
        } while (!bestaetigung.contains("J") && !bestaetigung.contains("N"));
        if (bestaetigung.contains("N")){
            bestellung.clear();
            System.out.println("Mögen Sie nächstes Mal wieder kommen.");
        }
        if (bestaetigung.contains("J")){
            System.out.println("Guten Apetit!");
        }
    }


    @Override
    public String toString() {
        return "Pizzeria{" +
                "name='" + name + '\'' +
                ",\n pizzas=" + pizzaSorten +
                ",\n zutaten=" + zutaten +
                '}';
    }
}
