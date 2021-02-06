package Irene.playschool;

public interface ISimulation {
    public void startSimulation();

    public void interaction(ISimulation target);

    public void auntieInteraction();

    public String getChildName();

    public String getName();

//    public Auntie getName();

    public int getMood();

    public void setMood(int mood);
}
