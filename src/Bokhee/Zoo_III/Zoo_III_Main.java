package Bokhee.Zoo_III;

public class Zoo_III_Main {
    public static void main(String[] args) {


        Zoo zoo = new Zoo("Wild Park Feldkirch");

        Compound cp1 = zoo.addCompound("Alps");
        Compound cp2 = zoo.addCompound("Savana");
        Compound cp3 = zoo.addCompound("Amazon");
        Compound cp4 = zoo.addCompound("Borneo");

        cp1.addAnimal("Rudolf","Reh");
        cp2.addAnimal("Leo","Lion");
        cp3.addAnimal("Saki","Monkey");
        cp4.addAnimal("Boa","Snake");

       zoo.addVeterinarian("Marcel");
       zoo.addVeterinarian("Kunas");
       zoo.addVeterinarian("Wagner");

       cp4.addAnimal("Papagai", " Bird");

       Zookeeper zk1 = new Zookeeper("Samuel");
       Zookeeper zk2 = new Zookeeper("Anna");
       Zookeeper zk3 = new Zookeeper("Leelee");
       Zookeeper zk4 = new Zookeeper("Aladine");

//       zk1.addfavouriteAnimal("Papagai","Bird");
//       zk2.addfavouriteAnimal("Bowbow","Lion");
//       zk3.addfavouriteAnimal("Bowbow","Dog");
//       zk4.addfavouriteAnimal("Jolli","Horse");


        zoo.printStructure("   ");
        zk1.printStructure("   ");

      //  zk1.work();
        zk1.marvelFavouriteAnimal();
        zk1.feedAnimals();

    }

}
