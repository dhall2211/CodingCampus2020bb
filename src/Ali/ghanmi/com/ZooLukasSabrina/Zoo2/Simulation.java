package Ali.ghanmi.com.ZooLukasSabrina.Zoo2;

import java.util.Vector;

public class Simulation {
    private Zoo zoo;
    private int day;
    public Simulation(Zoo zoo, int day){
        this.zoo = zoo;
        this.day =day;

    }
    public void start(){
        String action = "zookeeper füttern die Tiere";
            System.out.println("Simulation Läuft\n");
        for (int i = 0; i <day; i++) {
            zoo.feedAnimals();
            System.out.println(action);
            //jeden Tag:
            //Alle Zookeeper füttern die Tiere:
        }
    }


}
