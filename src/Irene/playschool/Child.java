package Irene.playschool;

import java.util.Random;

public class Child implements ISimulation {
    String childName;
    int mood;
    //private static String [] children = new String[]{"Joe", "Sandra", "Franziska", "Eric", "Mihael","Irene"};
    //ISimulation startSimulation;

    private static Random random = new Random();

//    public Child(String name, int mood, ISimulation startSimulation){
    public Child(String childName, int mood){
        this.childName = childName;
        this.mood = mood;
        //this.startSimulation = startSimulation;
    }

    public void interaction(ISimulation target) {
        int randomNumber = random.nextInt(6);
        switch (randomNumber){
            case 0:
                System.out.println(childName + " is playing a game.");
                System.out.println(childName + " won the game.");
                mood = mood + 2;
                break;
            case 1:
                System.out.println(childName + " is playing a game.");
                System.out.println(childName + " lost the game.");
                mood = mood - 2;
                break;
            case 2:
                if (childName != target.getChildName()) {
                    System.out.println(childName + " is playing with " + target.getChildName() + ".");
                    mood = mood + 1;
                    break;
                } else {
                    System.out.println(childName + " can't find anyone to play with.");
                    break;
                }
            case 3:
                System.out.println(childName + " pets the cat.");
                mood = mood + 2;
                break;
            case 4:
                System.out.println(childName + " pets the dog.");
                mood = mood + 2;
                break;
            case 5:
                System.out.println(childName + " watches the fish.");
                mood = mood + 1;
                break;
        }
        if (mood > 5) {
            mood = 5;
        }
        switch (mood) {
            case 0:
                System.out.println(childName + " is very sad.");
                break;
            case 1:
                System.out.println(childName + " is sad.");
                break;
            case 2:
                System.out.println(childName + " is in a neutral mood.");
                break;
            case 3:
                System.out.println(childName + " is a bit happy.");
                break;
            case 4:
                System.out.println(childName + " is happy.");
                break;
            case 5:
                System.out.println(childName + " is very happy.");
                break;
        }
    }

    @Override
    public void auntieInteraction() {
        if (mood <= 2) {
            System.out.println(getName() + " comforts " + childName + ".");
            mood = 3;
            System.out.println();
        }
    }

    public void startSimulation() {
        System.out.println(childName + " plays.");
    }

//    @Override
//    public void interaction(ISimulation target) {
//        System.out.println(name + " plays with " + target.getName());
//    }

    @Override
    public String getChildName() {
        return childName;
    }

    @Override
    public String getName() {
        return null;
    }

//    @Override
//    public Auntie getName() {
//        return getName();
//    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
}
