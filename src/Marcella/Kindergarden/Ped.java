package Marcella.Kindergarden;

public class Ped extends Being {

    public Ped(Kindergarden kindergarden, String name, String type) {
        super(kindergarden, name, type);
    }

    @Override
    public void doSomething() {
        int unhappiestChildIndex = kindergarden.getChildren().get(0).getHappyIndex();
        for (int i = 0; i < kindergarden.getChildren().size(); ++i) {
            if (unhappiestChildIndex > kindergarden.getChildren().get(i).getHappyIndex()) {
                unhappiestChildIndex = kindergarden.getChildren().get(i).getHappyIndex();
            }
        }

        Child unhappiestChild = kindergarden.getChildren().get(0);
        System.out.println(this.name + " kümmert sich um " + unhappiestChild.name);
    }

}
