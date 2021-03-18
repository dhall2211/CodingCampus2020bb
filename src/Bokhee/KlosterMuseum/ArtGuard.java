package Bokhee.KlosterMuseum;

public class ArtGuard {
    private String name;

    public ArtGuard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ArtGuard{" +
                "name='" + name + '\'' +
                '}';
    }
}
