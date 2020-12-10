package Ali.ghanmi.com.Company3.Company;

public class Main {

    public static void main(String[] args) {

        Employee Empl0 = new Employee("Alfred Boss");
        Employee Empl1 = new Employee("Hans Peter");
        Employee Empl2 = new Employee("Hanna Kaiser");
        Employee Empl3 = new Employee("Mustermann Max");
        Employee Empl4 = new Employee("Musterfrau Angela");
        Employee Empl5 = new Employee("Muste Alfons");
        Employee Empl6 = new Employee("Kufmann Alois");
        Employee Empl7 = new Employee("Gunz Herlinde");
        Employee Empl8 = new Employee("Friedrich Hermann");
        Employee Empl9 = new Employee("Peter Hannelore");
        Employee Empl10 = new Employee("But Moritz");

        Departement direction = new Departement("Vorstand");
        Departement sale = new Departement( "Vertrieb", direction);
        Departement salePrivat = new Departement("Vertrieb Privatkunden", sale);
        Departement saleB2B = new Departement("Vertrieb Firmenkunden", sale);


        System.out.println(direction +" "+Empl0);

        //  System.out.println(purchase.get);
        //buchhaltung.addCurrentEmployee(Empl10);

        //service.connectToDepartment(saleB2B);
       // buchhaltung.connectToDepartment(direction);
      // Empl1.switchDepartment(service);
       // direction.printOrganisation(" ");
        //Empl1.switchDepartment(service);
        // System.out.println(direction);
    }

}
