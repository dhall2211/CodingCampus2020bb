package ghanmi.com.OOP_CampusOrganisation;

public class Participant {

    private String firstName;
    private String lastName;
    private String requiredKnowledge_Qualification;
    private String phoneNum;
    private String mail;
    Adress adress;

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    Participant(String firstName, String lastName, String requiredKnowledge_Qualification, String phoneNum, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.requiredKnowledge_Qualification = requiredKnowledge_Qualification;
        this.phoneNum = phoneNum;
        this.mail = mail;
    }

    Participant(String firstName, String lastName, String requiredKnowledge_Qualification, String phoneNum,
                String mail, String street, String HausNumber, int postCode, String location, String Country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.requiredKnowledge_Qualification = requiredKnowledge_Qualification;
        this.phoneNum = phoneNum;
        this.mail = mail;
        this.adress = new Adress(street, HausNumber, postCode, location, Country);
    }

    Participant(String firstName, String lastName, String requiredKnowledge_qualification,
                String phoneNum, String mail, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.requiredKnowledge_Qualification = requiredKnowledge_qualification;
        this.phoneNum = phoneNum;
        this.mail = mail;
        this.adress = adress;

    }

    public String getFirstName() {

        return firstName;
    }
    public void setFirstName(String firstName) {
        if (!firstName.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException(firstName);
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException(lastName);
    }
        this.lastName = lastName;
    }

    public String getRequiredKnowledge_Qualification() {
        return requiredKnowledge_Qualification;
    }

    public void setRequiredKnowledge_Qualification(String requiredKnowledge_Qualification) {
        if (!requiredKnowledge_Qualification.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException(requiredKnowledge_Qualification);
    }
        this.requiredKnowledge_Qualification = requiredKnowledge_Qualification;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        if (!firstName.matches("[0-9]+")) {
            throw new IllegalArgumentException(firstName);
    }
        this.phoneNum = phoneNum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }


    public Participant() {

    }

    // @Override
    public String toString() {
        return ("Participant: " + firstName + " " + lastName + "\n" +
                "Level      : " + requiredKnowledge_Qualification + "\n" +
                "Tel        : " + phoneNum + "\n" +
                "Mail       : " + mail+"\n"+adress);
    }

    public void setAdress(String street, String hausNum, int postcode, String city, String country) {
        this.adress = new Adress(street,hausNum,postcode,city,country);
    }
}
