package Gyula.oop.MultiInterfaces;

public class Buchstabe implements IPrintStructure{
    private char b;

    public Buchstabe(char b){
        this.b = b;
    }

    @Override
    public void printStructure() {
        System.out.println("Buchstabe: " + b);
    }
}
