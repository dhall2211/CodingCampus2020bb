package Irene.skirental;

import java.util.Random;

public class SimulationFactory {
    private String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private Random random = new Random();

    public SimulationFactory(){};

    public Customer[] createCustomer(int count){
        Customer[] customers = new Customer[count];
        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            Customer customer = new Customer(name);
            customers[i] = customer;
        }
        return customers;
    }
}
