package Gyula.oop.InterfaceNachbesprechung;

public class SundayDish extends Dish {
    public SundayDish(String origin){
        super(origin);
    }

    public void sundayMeal(){
        System.out.println("Sunday meal has been served");
    }
}
