package Bokhee.Human;

public class Human {

    // Attribute
    private String name;
    private char gender;
    private Human mother;
    private Human father;

    // Constructor
    public Human(String name, char gender, Human mother, Human father) {
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, char gender) {
        this.name = name;
        this.gender = gender;
        this.mother = null;
        this.father = null;
    }

    // Function
    @Override
    public String toString() {
        String result = name;
        String genderText = " " + (gender == 'm' ? "Sohn" : "Tochter") + " von";
        if ((father != null) || (mother != null)) {
            result += genderText;
        }
        if (father != null) {
            result += " " + father.name;
        }
        if (mother != null) {
            if (father != null) {
                result += " und";
            }
            result += " " + mother.name;
        }
        return result;
    }

    // Function
    public void printFamilyTree(String prefix) {
        System.out.println(prefix + name + " (" + gender + ")");
        if (father != null) {
            father.printFamilyTree("   " + prefix);
        }
        if (mother != null) {
            mother.printFamilyTree("   " + prefix);
        }
    }
}


