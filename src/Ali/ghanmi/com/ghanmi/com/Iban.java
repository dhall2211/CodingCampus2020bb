package ghanmi.com;

public class Iban {
    public static void string() {
        String BankIban = "CH69 0012 3240 2500 1000 F";

        System.out.println(BankIban +" is Valid:  " + BankIban.matches("CH[0-9]{2} [0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4} F"));



    }
}
