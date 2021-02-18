package Irene.skirental;

public class Main {
    public static void main(String[] args) {
        Shop skiRental = Shop.getInstance();
        WebShop skiRentalWebShop = WebShop.getInstance();

        for (Category item : Category.values()) {
            try {
            System.out.println(item + ": " + item.getPrice());
            } catch (CategoryUnknownPriceException e) {
                System.out.println(e.getMessage());
                System.err.println(e.getMessage());
                //Durch das err wird die Fehlermeldung rot und am Ende ausgegeben.
            } catch (TestException f) {
                System.out.println(f.getMessage());
                System.err.println(f.getMessage());
            } finally {
                System.out.println("This block will always run.");
            }
        }
    }
}


