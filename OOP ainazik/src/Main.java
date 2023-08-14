import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Aigerim", "Avazbekova", 11.07);
        Person person2 = new Person("Aigfg", "Avazbekova", 11.07);
        Person person3 = new Person("Aiherim", "Avazbekova", 11.07);
        Person person4 = new Person("Aighrim", "Avazbekova", 11.07);
        Person[] people = {person4,person2,person3};
        Group group1 = new Group("JAVA11", 3.03, "Ainazik");
        Group group2 = new Group("JAVA11", 3.03, "Ainazik");
        Group group3 = new Group("JAVA11", 3.03, "Ainazik");
        Group[] groups = {group1,group2,group3};
        Company company1 = new Company("PeakSoft", "Kyrgyzstan", 2021, person1,people,groups);
        System.out.println(company1);


        Company [] companies = {company1,};
        System.out.println(Arrays.toString(companies ));

    }
}