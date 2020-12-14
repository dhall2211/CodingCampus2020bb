package Marcella.Zoo;

import Daniel.Zoo.Compound;
import Daniel.Zoo.Veterinary;

import java.util.Vector;

public class Zoo {

    private String name;
    private Vector <Enclosure> enclosures;
    private Vector <Food> food;
    private Vector <Ranger> rangers;
    private Vector<Vet> vets;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new Vector<>();
        this.food = new Vector<>();
        this.rangers = new Vector<>();
        this.vets = new Vector<>();
    }

    public Enclosure searchAndCreateEnclosure(String name) {
        for (int i = 0; i < enclosures.size(); i++) {
            if (enclosures.get(i).getName().equals(name)) {
                return enclosures.get(i);
            }
        }
        Enclosure newEnclosure = new Enclosure(name);
        enclosures.add(newEnclosure);
        return newEnclosure;
    }

    public Food searchAndCreateFood(String name, String amount) {
        Food newFood = searchAndCreateFood(name);
        newFood.setAmount(amount);
        return newFood;
    }

    public Food searchAndCreateFood(String name){
        for (int i = 0; i < food.size(); i++) {
            if (food.get(i).getName().equals(name)){
                return food.get(i);
            }
        }
        Food newFood = new Food(name, "N.N.");
        food.add(newFood);
        return newFood;
    }

    public Ranger searchAndCreateRanger(String name, Animal lovedAnimal, String[] rangersEnclosures){
        for (int i = 0; i < rangers.size(); i++) {
            if (rangers.get(i).getName().equals(name)){
                return rangers.get(i);
            }
        }

        Vector<Enclosure> enclosuresNewRanger = new Vector<>();
        for (String rangersEnclosure : rangersEnclosures) {
            Enclosure newRangersEnclosure = searchAndCreateEnclosure(rangersEnclosure);
            enclosuresNewRanger.add(newRangersEnclosure);
        }

        Ranger newRanger = new Ranger(name, lovedAnimal, enclosuresNewRanger);
        rangers.add(newRanger);
        return newRanger;
    }

    public Vet searchAndCreateVet(String name) {
        for (var vet : vets) {
            if (vet.getName().equals(name)) {
                return vet;
            }
        }

        var newVet = new Vet(name);
        vets.add(newVet);
        return newVet;
    }

    public Animal createAnimal(String enclosure, String name, String species, String food, int foodAmount){
        return new Animal(this, enclosure, name, species, food, foodAmount);
    }

    public void printStructure(String prefix){
        System.out.println(this.name);
        for (int i = 0; i < enclosures.size(); i++) {
            System.out.print(prefix + "Enclosure: ");
            enclosures.get(i).printStructure(prefix);
            System.out.println();
        }
        for (int i = 0; i < rangers.size(); i++) {
            System.out.print(prefix + "WärterInnen: ");
            rangers.get(i).printStructure(prefix);
            System.out.println();
        }
        System.out.println(prefix + "Futter Tagesbedarf: ");
        for (int i = 0; i < food.size(); i++) {
            food.get(i).printStructure(prefix + "    ");
        }
    }

}
