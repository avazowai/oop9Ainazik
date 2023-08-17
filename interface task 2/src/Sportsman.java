import java.time.LocalDate;

public abstract class Sportsman {
   private String name;
   private String surname;
   private LocalDate age;
   private double height;
   private double weight;

    public Sportsman(String name, String surname, LocalDate age, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sportsman " +
                "name : " + name + '\'' +
                " surname :" + surname + '\'' +
                " age : " + age +
                " height : " + height +
                "  weight :" + weight ;
    }
}
