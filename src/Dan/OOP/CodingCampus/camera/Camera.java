package Dan.OOP.CodingCampus.camera;

public class Camera {
      private String description;
      private int megaPixel;
      private boolean pictureStabilizer;
      private int focalLength;
      private String country;


    public Camera(String description, int megaPixel, boolean pictureStabilizer, int focalLength, String country) {
        this.description = description;
        this.megaPixel = megaPixel;
        this.pictureStabilizer = pictureStabilizer;
        this.focalLength = focalLength;
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMegaPixel() {
        return megaPixel;
    }

    public void setMegaPixel(int megaPixel) {
        this.megaPixel = megaPixel;
    }
    public boolean getPictureStabilizer () {
        return pictureStabilizer;
    }
    public void setPictureStabilizer (boolean pictureStabilizer) {
        this.pictureStabilizer = pictureStabilizer;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
