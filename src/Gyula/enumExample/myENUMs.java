package Gyula.enumExample;

public class myENUMs {
    public enum Activity {
        SLEEP(100),
        SHOWER(101),
        EAT(102),
        WORK(103),
        LEARN(104),
        PRY(200);

        private final int code;
        Activity(int code) {this.code = code;}
        public int getValue() { return code;}
    };


    public static void main(String[] args) {
        Activity currentAct = Activity.LEARN;
        System.out.println("currentAct: " + currentAct);

        switch (currentAct){
            case SLEEP:
                // TODO: 28.01.2021 ....
                break;
            case EAT:
                // TODO: 28.01.2021 ....
                break;
            default:
                // TODO: 28.01.2021 ....
                System.out.println("Something else");
                break;
        }
    }
}
