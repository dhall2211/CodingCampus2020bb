package Alex.Zoo;

public class TierArzt {

    private String name;

    public TierArzt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printStrukturArzt(String prefix) {
        System.out.println(prefix + this.name);
    }
}
