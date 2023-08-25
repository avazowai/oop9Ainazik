import java.time.LocalDate;

public class Passport {
    private LocalDate age;
    private String country;
    private String gender;


    public Passport(LocalDate age, String country, String gender) {
        this.age = age;
        this.country = country;
        this.gender = gender;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}