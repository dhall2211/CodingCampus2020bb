package Bokhee.Fachladen2;

public class WebSite implements IAgent{

    private static WebSite currentWebSite;

    private WebSite() {

    }

    public static WebSite getCurrentWebSite(){
        if(currentWebSite == null) {
            currentWebSite = new WebSite();
        }
        return currentWebSite;
    }

    @Override
    public Enum askProductFor(Enum category) {
        return category;
    }

    @Override
    public void reserveProduct(IProduct product, Customer customer) {

    }
}
