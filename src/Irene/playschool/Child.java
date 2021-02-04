package Irene.playschool;

import java.util.Random;

public class Child implements ISimulation {
    String name;
    int mood;
    //private static String [] children = new String[]{"Joe", "Sandra", "Franziska", "Eric", "Mihael","Irene"};
    //ISimulation startSimulation;

    private static Random random = new Random();

//    public Child(String name, int mood, ISimulation startSimulation){
    public Child(String name, int mood){
        this.name = name;
        this.mood = mood;
        //this.startSimulation = startSimulation;
    }

    public void interaction() {
        int low = 2;
        int high = 5;
        mood = random.nextInt(high - low) + low;
        int interactID = random.nextInt(5);
        switch (interactID){
            case 0:
                System.out.println(name + " is playing a game.");
                System.out.println(name + " won the game.");
                mood =+ 2;
                break;
            case 1:
                System.out.println(name + " is playing a game.");
                System.out.println(name + " lost the game.");
                mood =- 2;
                break;
            case 2:
                System.out.println(name + " is playing with.");
                mood =+ 1;
                break;
            case 3:
                System.out.println(name + " pets the cat.");
                mood =+ 1;
                break;
            case 4:
                System.out.println(name + " pets the dog.");
                mood =+ 2;
                break;
            case 5:
                System.out.println(name + " watches the fish.");
                break;
        }
        if (mood > 5) {
            mood = 5;
        }
        switch (mood) {
            case 0:
                System.out.println(name + " is very sad.");
                break;
            case 1:
                System.out.println(name + " is sad.");
                break;
            case 2:
                System.out.println(name + " is in a neutral mood.");
                break;
            case 3:
                System.out.println(name + " is a bit happy.");
                break;
            case 4:
                System.out.println(name + " is happy.");
                break;
            case 5:
                System.out.println(name + " is very happy.");
                break;
        }
    }

    public void startSimulation() {
        System.out.println(name + " plays.");
    }

    @Override
    public void interaction(ISimulation target) {
        System.out.println(name + " plays with " + target.getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
