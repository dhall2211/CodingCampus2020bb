package Irene.playschool;

public interface ISimulation {
    public void startSimulation();

    public void interaction(ISimulation target);

    public String getName();
}
