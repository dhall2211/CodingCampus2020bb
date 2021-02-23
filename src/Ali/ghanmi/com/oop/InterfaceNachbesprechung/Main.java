package Ali.ghanmi.com.oop.InterfaceNachbesprechung;

public class Main {
    public static void main(String[] args) {
        SundayDish omasDish = new SundayDish("Meisener");
        Dish dish = omasDish;
        IWashable washable = omasDish;

        // Es geht nicht!
        // SundayDish opasDish = new Dish("noname");

        washable.wash();

        omasDish.wash();
        omasDish.sell();

        omasDish.sundayMeal();
        omasDish.wash();
        omasDish.sell();

        System.out.println(washable.getClass().getName());
        System.out.println(dish.getClass().getName());
        System.out.println(omasDish.getClass().getName());



    }
}
