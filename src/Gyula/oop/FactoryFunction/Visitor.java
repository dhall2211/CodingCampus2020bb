package Gyula.oop.FactoryFunction;

public class Visitor {
    private String name;

    public Visitor(String name){
        this.name = name;
    }

    public void observe(){
        System.out.println(name + " observes musuem piece.");
    }

    public String getName() {
        return name;
    }
}
