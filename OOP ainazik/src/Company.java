import java.util.Arrays;

public class Company {
   private String companyName;
    private String country;
    private double yearOfFoundation;
    private Person founder;

    private Person[] people;
    private Group[] groups;

    public Company(String companyName, String country, double yearOfFoundation, Person founder, Person[] people, Group[] groups) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.people = people;
        this.groups = groups;
    }

    public Company() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(double yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }


    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", founder=" + founder +
                ", people=" + Arrays.toString(people) +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
