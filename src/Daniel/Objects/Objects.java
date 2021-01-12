package Daniel.Objects;

import java.util.Vector;

public class Objects {
    public static void main(String[] args){
        // Objekte sind Instanzen von Klassen und exisitieren zur Laufzeit
        Child maria = new Child("Maria");
        Child franz = new Child("Franz");
        Child claudia = new Child("Claudia");
        maria.setBestFriend(franz);
        franz.setBestFriend(claudia);
        claudia.setBestFriend(maria);

        Ball blueBall = new Ball("blue");
        Ball redBall = new Ball("red");

        ToyBox ballBox = new ToyBox();
        ballBox.addBall(blueBall);
        ballBox.addBall(redBall);

        franz.playWithBall(redBall);
    }

    // Klassen sind Baupläne für Objekte (Entwicklungzeit)
    static class Child {
        private String name;
        private Child bestFriend;

        public Child(String name) {
            this.name = name;
        }

        // Übergabe einer Referenz (Adresse) eines Child-Objekts
        public void setBestFriend(Child bestFriend) {
            this.bestFriend = bestFriend;
        }

        public void playWithBall(Ball ball){
            System.out.println(name + " plays with the " + ball);
        }

        @Override
        public String toString() {
            return name + ", bestFriend=" + bestFriend;
        }
    }

    static class Ball {
        private String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return color + " ball";
        }
    }

    static class ToyBox {
        private Vector<Ball> balls;

        public ToyBox() {
            this.balls = new Vector<>();
        }

        public void addBall(Ball ball){
            this.balls.add(ball);
        }

        @Override
        public String toString() {
            return "ToyBox{" +
                    "balls=" + balls +
                    '}';
        }
    }
}
