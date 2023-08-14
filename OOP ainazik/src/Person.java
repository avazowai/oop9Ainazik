import java.util.Arrays;



    public class Person {

        private String firstName;
        private String lastName;
        private double dateOfBirth;

        public Person (String firstName, String lastName, double dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    '}';
        }
    }
