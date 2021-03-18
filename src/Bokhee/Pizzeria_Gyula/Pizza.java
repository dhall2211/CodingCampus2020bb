package Bokhee.Pizzeria_Gyula;


import java.util.Vector;

public class Pizza {

        private int id;
        private String name;
        private float preis;
        private Vector<Zutat> basisZutaten;
        private Vector<Zutat> zutaten;

        private static int nextId = 1;

        public Pizza(String name, float preis){
            this.id = nextId;
            ++nextId;
            this.name = name;
            this.preis = preis;
            this.zutaten = new Vector<>();
            this.basisZutaten = new Vector<>();
        }

        public Pizza(Pizza original){
            this.id = original.id;
            this.name = original.name;
            this.preis = original.preis;
            this.zutaten = (Vector<Zutat>) original.zutaten.clone();
            this.basisZutaten = (Vector<Zutat>) original.basisZutaten.clone();
        }

        public void addBasisZutat(Zutat zutat){
            basisZutaten.add(zutat);
        }

        public void addZutat(Zutat zutat){
            zutaten.add(zutat);
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public float getPreis() {
            return preis;
        }

        public float getTotalPreis(){
            float totalPreis = preis;
            for (Zutat z: zutaten) {
                totalPreis += z.getPreis();
            }
            return totalPreis;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", preis=" + preis +
                    ", basis=" + basisZutaten +
                    ", zutaten=" + zutaten +
                    '}';
        }
}
