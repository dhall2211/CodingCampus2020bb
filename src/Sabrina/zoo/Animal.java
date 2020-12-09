package Sabrina.zoo;

public class Animal {
    private String name;
    private String genus;

    public Animal(String name, String genus) {
        this.name = name;
        this.genus = genus;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", genus='" + genus + '\'' +
                '}';
    }
    public String getName() { return name;};
    public String getGenus() {return genus;};
}
