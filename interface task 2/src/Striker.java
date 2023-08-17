import java.time.LocalDate;

public class Striker extends Sportsman implements Ainazik3 {

    public Striker(String name, String surname, LocalDate age, double height, double weight) {
        super(name, surname, age, height, weight);
    }

    @Override
    public void attack() {
        System.out.println("Striker");
    }
}
