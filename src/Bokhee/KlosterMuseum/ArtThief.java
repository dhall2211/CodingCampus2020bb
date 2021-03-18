package Bokhee.KlosterMuseum;

public class ArtThief {
    private String name;

    public ArtThief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ArtThief{" +
                "name='" + name + '\'' +
                '}';
    }
}
