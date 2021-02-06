package Marcella.Kindergarden;

public abstract class Being implements ISimulation {

    protected Kindergarden kindergarden;
    protected String name;
    protected String type;

    public Being(Kindergarden kindergarden, String name, String type) {
        this.kindergarden = kindergarden;
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }
}
