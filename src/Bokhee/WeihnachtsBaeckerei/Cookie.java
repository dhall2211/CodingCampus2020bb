package Bokhee.WeihnachtsBaeckerei;

public class Cookie {

    private String name;
    private int unity;

    public Cookie(String name, int unity) {
        this.name = name;
        this.unity = unity;

    }

    public Cookie(Employee employee, String name) {
        this.name = name;
        employee.addBakeableCookie(this.name);
    }

    public String getName() {
        return name;
    }

    public int getUnity() {
        return unity;
    }

    @Override
    public String toString() {
        return
               name+"\t" +
               unity +"g";
    }

    public void printStructure(){
        System.out.println();
    }
}
