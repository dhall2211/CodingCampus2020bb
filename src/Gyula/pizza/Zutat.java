package Gyula.pizza;

public class Zutat {
    private int id;
    private String name;
    private float preis;

    private static int nextId = 1;

    public Zutat(String name, float preis){
        this.id = nextId;
        ++nextId;
        this.name = name;
        this.preis = preis;
    }


    @Override
    public String toString() {
        return "Zutat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preis=" + preis +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getPreis() {
        return preis;
    }
}
