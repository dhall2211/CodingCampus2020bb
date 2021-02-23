package Ali.ghanmi.com.oop.FactoryFunction;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static String[] firstName = {"Paul", "Paula", "Anton", "Antonella"};
    private static String[] lastName = {"Moosbrugger", "Simma", "Wohlgenannt", "Kung"};

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Visitor v = createVisitor();
            v.observe();
        }
    }


    public static Visitor createVisitor(){
        Visitor v;
        String name =
                firstName[random.nextInt(firstName.length)] + " " +
                lastName[random.nextInt(lastName.length)];
        if (random.nextInt(100) > 80){
            v = new Thief(name);
        } else {
            v = new Visitor(name);
        }
        return  v;
    }
}
