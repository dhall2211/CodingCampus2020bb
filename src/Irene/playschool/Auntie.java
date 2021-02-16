package Irene.playschool;

public class Auntie implements ISimulation {
    String name;

    public Auntie(String name) {
        this.name = name;
    }

    @Override
    public void startSimulation() {

    }

    @Override
    public void interaction(ISimulation target) {

    }

    public void auntieInteraction() {

    }

    @Override
    public String getChildName() {
        return null;
    }

    @Override
    public int getMood() {
        return 0;
    }

    @Override
    public void setMood(int mood) {

    }

    public String getName() {
        return name;
    }

//    public Auntie getName() {
//        return name;
//    }
}
