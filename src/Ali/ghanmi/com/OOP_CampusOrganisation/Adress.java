package ghanmi.com.OOP_CampusOrganisation;

public class Adress {
    private String street;
    private String hausNumber;
    private int postCode;
    private String location;
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (!street.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException(street);
        }
        this.street = street;
    }

    public String getHausNumber() {
        return hausNumber;
    }

    public void setHausNumber(String hausNumber) {
        this.hausNumber = hausNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        if (postCode<0) {
            throw new IllegalArgumentException();
        }
        this.postCode = postCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (!location.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException(location);
        }
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException(country);
        }
        this.country = country;
    }

     Adress(String street, String hausNumber, int postCode, String location, String country) {
        this.street = street;
        this.hausNumber = hausNumber;
        this.postCode = postCode;
        this.location = location;
        this.country = country;
    }


    @Override
    public String toString() {
        return  "Adress :"+"\n"+
                "Strasse:  "+ street + "\n"+
                "hausNr :  "+ hausNumber + "\n" +
                "PLZ    :  " + postCode +"\n"+
                "Ort    :  " + location + "\n" +
                "Land   :  " + country;
    }

    public Adress() {

    }
}