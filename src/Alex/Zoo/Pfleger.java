package Alex.Zoo;

public class Pfleger {

    private String name;


    public Pfleger(String name) {
        this.name = name;

    }



    public String getName() {
        return name;
    }

    public void printStrukturPfleger(String prefix) {
        System.out.println(prefix + this.name);

    }
}



