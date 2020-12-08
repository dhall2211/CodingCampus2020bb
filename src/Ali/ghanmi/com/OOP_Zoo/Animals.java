package Ali.ghanmi.com.OOP_Zoo;

public class Animals {
    private String name;
    private String tierart;
    private String herkuftLand;
    private int  alt;
    private EnclosurePark enclosureParks;

    public Animals(EnclosurePark enclosureParks,String name, String tierart, String herkuftLand, int alt) {
        this.name = name;
        this.tierart = tierart;
        this.herkuftLand = herkuftLand;
        this.alt = alt;
        this.enclosureParks = enclosureParks;
    }
}
