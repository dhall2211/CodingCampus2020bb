package Sabrina.people;

public class Main {
    public static void main(String[] args) {
        People p1 = new People("Sabrina", "Vonbrül",1974, "Feldkirch", 'f');
        People p2 = new People("Marcella", "Merholz", 1977, "Marktheidenfeld", 'f');
        People p3 = new People("Klaus", "Nussbaumer", 1978, "Bregenz", 'm');

        printPeople(p1);
        printPeople(p2);
        printPeople(p3);
        p1.setLastName("Bollhalder");
        printPeople(p1);

    }
    public static void printPeople (People p){
        System.out.printf("%-14s %-14s %-6d %-18s %s %n", p.getFirstName(), p.getLastName(), p.getBirthYear(),p.getBirthPlace(),p.getGender());
    }

}
