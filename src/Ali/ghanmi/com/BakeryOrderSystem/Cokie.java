package Ali.ghanmi.com.BakeryOrderSystem;

public class Cokie {
    private String name;


    public Cokie(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }


    public void printStructure() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Cokie: "+ name;
    }
}