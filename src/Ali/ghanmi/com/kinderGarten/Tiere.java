package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public abstract class Tiere implements ISimulation {
    protected String name;
    protected Vector<Kind> kinds;

    public Tiere(String name) {
        this.name = name;
        this.kinds = new Vector<>();
    }
    public void addKind(Kind kind){
        kinds.add(kind);
    }
}
