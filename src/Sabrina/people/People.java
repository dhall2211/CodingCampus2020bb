package Sabrina.people;

public class People { // (Objekt-)Klasse
    private String firstName;//Attribute
    private String lastName;
    private int birthYear;
    private String birthPlace;
    private char gender;

    //constructor

    public People (String firstName, String lastName, int birthYear, String birthPlace, char gender){
        //hier werden die Attribute übergeben
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthPlace = birthPlace;
        this.gender = gender;
    }

    public String getFirstName (){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public String getBirthPlace() {
        return birthPlace;
    }
    public char getGender() {
        return gender;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


