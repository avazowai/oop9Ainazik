
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport(03.01, "Kyrgyzstan", "Male");
        Passport passport2 = new Passport(08.08, "Kyrgyzstan", "Male");

        Product product = new Product("Watermelon", "good", 90, 200, 06.23, "no");
        Product product2 = new Product("lagman", "good", 600, 400, 06.70, "yes");
        Product product3 = new Product("Salo", "Pig's", 350, 80, 03.12, "is haram");
        Product product4 = new Product("Kalbasa", "vkusnaya", 160, 500, 08.29, "no");

        Product[] products = {product, product2};
        Product[] products2 = {product3, product4};

        Bank bank = new Bank("Aigerim", 43223, 87654000);
        Bank bank2 = new Bank("Akylai", 76544, 87654000);

        Costumer costumer = new Costumer("Aigerim", passport, products, bank);
        Costumer costumer2 = new Costumer("Akylai", passport2, products2, bank2);

        Costumer[] costumers = {costumer, costumer2};
        //System.out.println(Arrays.toString(costumers));
        System.out.println("1.Prosmotr Banka");
        System.out.println("2.Prosmotr produktov");
        System.out.println("3.Prosmotr pasporta");
        System.out.println("4.Prosmotr produktov pokupatelya ");
        System.out.println("5.Udalenie produktov");
        System.out.println("6.Add product");

        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();


        switch (options) {
            case 1:
                System.out.println("1.Prosmotr Banka");
                System.out.println("Aigerim" + bank);
                System.out.println("Akylai" + bank2);
                break;
            case 2:
                System.out.println("2.Prosmotr produktov" + Arrays.toString(products));
                System.out.println(Arrays.toString(products2));
                break;
            case 3:
                System.out.println("3.Prosmotr pasporta");
                System.out.println("Aigerim" + passport);
                System.out.println("Akylai" + passport2);
                break;
            case 4:
                System.out.println("4.Prosmotr produktov pokupatelya ");
                System.out.println("Aigerim" + Arrays.toString(products));
                System.out.println("Akylai" + Arrays.toString(products2));

                break;
            case 5:
                System.out.println("5.Udalenie produktov");
                costumer.deleteProductByName("Aigerim", "Smetana");
                break;
            case 6:
                costumer.addProduct(product);

        }
    }
}