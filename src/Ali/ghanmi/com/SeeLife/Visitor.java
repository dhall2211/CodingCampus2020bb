package Ali.ghanmi.com.SeeLife;

public class Visitor extends Person {

    public Visitor(String name) {
        super(name, Type.VISITOR);

    }

    @Override
    public String toString() {
        return "Name: "+name+" "+type;
    }
}
