import java.time.LocalDate;

public class Goalkeeper extends Sportsman implements Ainazik2 {


    public Goalkeeper(String name, String surname, LocalDate age, double height, double weight) {
        super(name, surname, age, height, weight);
    }

    @Override
    public void catchh() {
        System.out.println("catch");

    }
}
