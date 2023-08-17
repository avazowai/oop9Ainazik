import java.time.LocalDate;

public class Defender extends Sportsman implements Ainazik {


    public Defender(String name, String surname, LocalDate age, double height, double weight) {
        super(name, surname, age, height, weight);
    }

    @Override
    public void protect() {
        System.out.println("defender");
    }
}
