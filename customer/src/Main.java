
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        Passport passport = new Passport(LocalDate.of(1990, 5, 15), "Dubai", "Female");
        Passport passpor = new Passport(LocalDate.of(2009, 3, 8), "Japan", "Male");
        Passport passport1 = new Passport(LocalDate.of(2005, 7, 11), "Kyrgyzstan", "female");
        Passport[] passports = {passpor, passport,passport1};


        Bank bank = new Bank("Aigerim", "2323", 10000);
        Bank bank1 = new Bank("Semetey", "56789", 2000);
        Bank[] banks = {bank, bank1};


        Product product = new Product("Coca Cola", "Beverage", 234, 100, LocalDate.of(2021, 9, 10), "-");
        Product product2 = new Product("Belyi", "Beverage", 89, 890, LocalDate.of(2023, 6, 10), "+");
        Product product3 = new Product("Pepsi", "Beverage", 89, 456, LocalDate.of(2022, 9, 10), "-");
        Product product4 = new Product("Baltika", "Beverage", 77, 5, LocalDate.of(2023, 5, 10), "+");
        Product product5 = new Product("Новый продукт!", "Beverage", 90, 67, LocalDate.of(2022, 9, 10), "-");
        Product[] products = {product, product2};
        Product[] productss = { product3, product4};


        Customer customer = new  Customer("Manas", passport, bank, products);
        Customer customer2 = new  Customer("Semetey", passpor, bank1, productss);
        Customer[] costumers = {customer, customer2};




//        System.out.println("Добавили новый продукт!");
//        System.out.println(Arrays.toString(dataBaza.addProduct("Manas", products, product5)));
//        System.out.println("--------------------------------------");
//        System.out.println("Информация о продукте!");
//        System.out.println(dataBaza.getProductInfo("Coca Cola"));
//        System.out.println(dataBaza.getProductInfo("Pepsi"));
//        System.out.println("--------------------------------------");
//        System.out.println("Удалили продукт у Алибека Водку");
//        dataBaza.deleteProductByName("Alibek");
//        System.out.println("------------------------------------------");
//        System.out.println("Заменили имя Belyi на новое Belyi Medved!");
//        dataBaza.updateName("Belyi", "Belyi Medved");
//        System.out.println("--------------------------------------------");
//        dataBaza.payment("Semetey","56789",scanner);
//        dataBaza.sellProductToCustomer("Manas",product);

    }
}