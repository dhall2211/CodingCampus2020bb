package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class Staff {
    private String name;
    private Product specialty;
    private int productionCapacity;
    private Vector<Product> products;
    private Confectionery confectionery;

    public Staff(String name, Product specialty, int produktionCapacity, Vector<Product> products, Confectionery confectionery) {
        this.name = name;
        this.specialty = specialty;
        this.productionCapacity = produktionCapacity;
        this.products = products;
        this.confectionery =confectionery;
    }

    public String getName() {
        return name;
    }

    public void printStructure(String prefix) {
        System.out.println(prefix+" Staff: "+name+"\n          Specialty: "+specialty.getName()+"\n          Capacity: "+productionCapacity);
        for (int i = 0; i <products.size() ; i++) {
            System.out.println("           *"+ "Other spcialty: "+products.get(i).getName());
        }
        System.out.println("*************");
    }

    public void addSpcialty(Product product) {
        products.add(product);

    }
}
