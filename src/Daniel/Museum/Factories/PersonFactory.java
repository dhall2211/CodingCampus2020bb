package Daniel.Museum.Factories;

import Daniel.Museum.Guard;
import Daniel.Museum.Thief;
import Daniel.Museum.Visitor;

import java.util.LinkedList;
import java.util.Random;

public class PersonFactory {
    private static String[] firstNames = new String[]{"Daniel", "Erich", "Bokhee", "Marcella", "Ali", "Sabrina", "Mihael", "Samet", "Irene"};
    private static String[] lastNames = new String[]{"Maier", "Müller", "Böhler", "Schmidt", "Apfelauge", "Rüetli", "Mähr", "Amann", "Metzger"};
    private static Random random = new Random(System.currentTimeMillis());

    public static Visitor createVisitor(){
        String firstName = firstNames[random.nextInt(firstNames.length-1)];;
        String lastName = lastNames[random.nextInt(lastNames.length-1)];;
        return new Visitor(firstName, lastName);
    }

    public static Thief createThief(){
        String firstName = firstNames[random.nextInt(firstNames.length-1)];;
        String lastName = lastNames[random.nextInt(lastNames.length-1)];;
        return new Thief(firstName, lastName);
    }
    
    public static LinkedList<Guard> createGuards(int count) {
        LinkedList<Guard> guards = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length-1)];;
            String lastName = lastNames[random.nextInt(lastNames.length-1)];;
            guards.add(new Guard(firstName, lastName));
        }
        return guards;
    }

    public static LinkedList<Visitor> createVisitors(int count) {
        LinkedList<Visitor> visitors = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            visitors.add(PersonFactory.createVisitor());
        }
        return visitors;
    }
}
