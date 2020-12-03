package Daniel.Course;

public class Program {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Gerhard", "Gruber"),
                new Student("Martina", "Mayer"),
                new Student("Nadine", "Nissel"),
                new Student("Bernhard", "Bauer"),
        };
        Trainer[] trainers = new Trainer[]{
                new Trainer("Natascha", "Nigsch"),
                new Trainer("Mario", "Muxel")
        };
        Building building = new Building("Graf Hugo");
        Room room = new Room("B076", building);
        Course fkBb = new Course("Feldkirch Berufsbegleitend 2020", room, trainers, students);

        System.out.println(fkBb);
    }
}
