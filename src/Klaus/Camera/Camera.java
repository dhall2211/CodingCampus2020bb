package Klaus.Camera;

public class Camera {
    private String exactName; //Pflichtfeld
    private float megaPixel; //Pflichtfeld
    private String countryOfOrigin; //Plicht
    private String owner; //optional
    private String functions; //Pflicht
    private Lens currentLens;
    private MemoryCard currentMemorycard;

//Constructor
        public Camera(String exactName, float megaPixel, String countryOfOrigin, String functions) {
        this.exactName = exactName;
        this.megaPixel = megaPixel;
        this.countryOfOrigin = countryOfOrigin;
        this.functions = functions;
        this.currentLens = null;
        this.currentMemorycard = null;
    }

    public String getExactName() {
        return exactName;
    }

    public void setExactName(String exactName) {
        this.exactName = exactName;
    }

    public float getMegaPixel() {
        return megaPixel;
    }


    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    public String getFunctions() {
        return functions;
    }

    public String getDataSheet() {
        String dataSheet = exactName + '\n' +
                "Herkunftsland: " + countryOfOrigin + '\n' +
                "Besitzer: " + owner + '\n' +
                "Megapixel: " + megaPixel + '\n' +
                "Funtionen: " + functions;
        return dataSheet;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCurrentLens(Lens currentLens) {
        this.currentLens = currentLens;
    }

    public void setCurrentMemorycard(MemoryCard currentMemorycard) {
        this.currentMemorycard = currentMemorycard;
    }

    public void takePhoto (){


    }

    public void deleteAllPhotos(){


    }

    public void deleteXPhotos(){


    }
}
