public class Reader {

        private String fullName;
        private int libraryCardNumber;
        private String faculty;
        private double dateOfBirth;
        private String phoneNumber;

    public Reader(String fullName, int libraryCardNumber, String faculty, double dateOfBirth, String phoneNumber) {
    }

    // Конструктор и другие методы класса

        public void takeBook(int numberOfBooks) {
            System.out.println(fullName + " взял " + numberOfBooks + " книги");
        }

        public void returnBook(int numberOfBooks) {
            System.out.println(fullName + " вернул " + numberOfBooks + " книги");
        }
    }







