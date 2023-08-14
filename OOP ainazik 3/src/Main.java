public class Main {
    public static void main(String[] args) {

        Person person = new Person("aigerim",11,"female");
        Person person2 = new Person ("bekzat",36,"male");
        Person person3 = new Person ("bekzat",32,"male");
        Person person4 = new Person ("bekzat",33,"male");
        Person person5 = new Person ("bekzat",22,"male");

        Person[] people = {person,person2,person3,person4,person5};
        int age = 0;
        for (Person t:people) {
            if (age< t.getAge()){
                age =t.getAge();
            }

        }
        System.out.println(age);


    }
}