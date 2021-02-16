package Daniel.Exceptions;

public class Main {
    public static void main(String[] args) {
        for (var item : Items.values()) {
            try {
                System.out.println(item.name() + " kostet " + item.getPrice());
            } catch (ItemUnknownPriceException e) {
                System.err.println("Fehler bei Pricing: " + e.getMessage());
            } finally {
                System.out.println("dieser Block wird immer ausgeführt");
            }
        }
    }
}
