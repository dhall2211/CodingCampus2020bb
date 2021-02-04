package Gyula.oop.FirstInterface;

public class Lehrer {
    String name;
    ISayHello sayHello;
    public Lehrer(String name, ISayHello sayHello){
        this.name = name;
        this.sayHello = sayHello;
    }

    public void greeting(){
        System.out.println(name + ": " + sayHello.sayHello());
    }
}
