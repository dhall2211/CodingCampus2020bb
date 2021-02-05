package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public class KinderGartenMain {
    public static void main(String[] args) {



        Vector<Tiere> tieres = new Vector<>();

        Vector<Person> personen = new Vector<>();
        personen.add(new KinderGäertner("Manuel"));
        personen.add(new Kind("Alex"));


        tieres.add(new Katze("fritz"));
        tieres.add(new Katze("Franz"));
        tieres.add(new Hund("Bello"));
        tieres.add(new Hund("Bellaaaaaaaaaaaa"));
        tieres.add(new Fisch("Memo"));

        Vector<ISimulation> lebewesens = new Vector<>();
        lebewesens.add(new KinderGäertner("Manuel"));
        lebewesens.add(new Kind("Alex"));


        lebewesens.add(new Katze("fritz"));
        lebewesens.add(new Katze("Franz"));
        lebewesens.add(new Hund("Bello"));
        lebewesens.add(new Hund("Bellaaaaaaaaaaaa"));
        lebewesens.add(new Fisch("Memo"));


        for (ISimulation l : lebewesens) {
            l.printSimulation();
        }
     //   for (Person  p: personen) {
      //      p.printSimulation();
        }
    }

