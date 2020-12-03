package Ali.ghanmi.com;

public class MethodenWärhungsrechner2 {
    public static double Exchange(double amount, String currency) {
        double exchangeRate = 0;

        switch (currency) {
            case "CHF":
                exchangeRate = 1.07;
                break;
            case "USD":
                exchangeRate = 1.16;
                break;
            default:
                System.out.println("no change");
        }
        return Exchange(amount, exchangeRate);
    }

    public static double Exchange(double amount, double exchangeRate) {
        return amount * exchangeRate;

    }
}

/*
public class MethodenWärhungsrechner {
    public static double Wärhungsrechner(String devise) {
        double dolar=0;
        double euro=0;
        double chf=0;
        double amount = 0;
        String changeTodo;
        String torecive;




        switch (devise) {
            case "1":
                dolar = 1;
                chf = 0.89;
                break;
            case "deviseTorecivedollar_euro":
                dolar = 1;
                euro = 0.893;
                break;
            case "chf to euro":
                chf = 1;
                dolar = 0.92;
                break;
            case "deviseTochangechf_dolar":
                chf = 1;
                dolar = 1.08;

                break;
            case "deviseTorecivechf_euro":
                euro = 1;
                dolar = 1.07;

                break;
            case "deviseToreciveeuro_chf":
                euro = 1;
                chf = 1.08;

                break;

            default:
                System.out.println("no Change posible");
        }
        return calculateMychange(amount,e);
    }


    public static double calculateMychange(int amount, double deviseTochange,double deviseTorecive ) {
        double yourChange = (amount*deviseTochange * deviseTorecive);

        return yourChange;


    }



    }



 */