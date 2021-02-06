package Gyula.oop.FactoryFunction;

public class Thief extends Visitor{
    public Thief(String name){
        super(name);
    }

    @Override
    public void observe() {
        System.out.println(getName() + " tries to steal a museum piece.");
    }
}
