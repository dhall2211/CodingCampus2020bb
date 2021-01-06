package Marcella.XmasBakery;

public class Cookie {

    private String name;

    public Cookie(Bakery bakery, String name) {
        this.name = name;
        bakery.addNewCookie(this);
    }

    public void printStructure(String spaces) {
        System.out.println(spaces + "_ " + this.name);
    }

}
