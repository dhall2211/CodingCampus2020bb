package Bokhee.Human;


public class Human_Main {
    public static void main(String[] args) {

        Human mm = new Human("Ilona T.", 'f');
        Human mf = new Human("Arpad B", 'm');
        Human fm = new Human("Justina N.", 'f');
        Human ff = new Human("Gyula H.", 'm');
        Human m1 = new Human("Erzsebet H.", 'f', mm, mf);
        Human f1 = new Human("Gyula H.", 'm', fm, ff);
        Human me = new Human("Gyula Horvath", 'm', m1, f1);
        System.out.println(me);
        me.printFamilyTree("");
    }

}
