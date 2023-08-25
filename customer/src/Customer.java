import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class Customer {

    private String name;
    private Passport passport;
    private Product[] products;
    private Bank bank;
    private Scanner scanner;

    public Customer(String name, Passport passport, Product[] products, Bank bank, Scanner scanner) {
        this.name = name;
        this.passport = passport;
        this.products = products;
        this.bank = bank;
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Product getProductInfo(String name) {
        for (Product t : products) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    public String deleteProductByName(String name, String productName) {
        int indexToRemove = 99;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName)) {
                indexToRemove = i;
                break;
            }

        }
        return "Successfully deleted!";
    }

    public Product[] addProduct(String customerName, Product newProduct) {
        Customer customer = findCustomerByName(customerName);

        if (customer != null) {
            products = Arrays.copyOf(products, products.length + 1);
            products[products.length - 1] = newProduct;
        } else {
            System.out.println("Такого клиента не существует!");
        }

        return products;
    }

    public void payment(String name, String password, Scanner scanner) {
            if (bank.getUserName().equals(name) && bank.getPassword().equals(password)) {
                System.out.println("Вы вошли в аккаунт!");
                System.out.println("Что хотите сделать? Купить товар (1) или взять кредит (2)?");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: {
                        int totalCost = 0;
                        for (Product product : products) {
                            if (product.getPrise() != 0) {
                                totalCost += product.getPrise();
                            }
                        }

                        if (bank.getTotalMoney() >= totalCost) {
                            System.out.println("Денег хватает!");
                        } else {
                            System.out.println("Денег не хватает, возьмите в долг!");
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("Сколько долга?");
                        int debt = scanner.nextInt();
                        int newMoney = bank.getTotalMoney() + debt;
                        bank.setTotalMoney(newMoney);
                        System.out.println("Вы взяли кредит " + debt + " сом. Ваш текущий баланс: " + newMoney);
                        break;
                    }

                    default: {
                        System.out.println("Неправильный выбор.");
                        break;
                    }
                }
            }
    }


    public boolean isCustomerAdult() {
        int age = Period.between(passport.getAge(), LocalDate.now()).getYears();
        return age >= 18;
    }

    public boolean isProductExpired(Product product) {
        return product.getData().isBefore(LocalDate.now());
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void sellProductToCustomer(Product product, String customerName) {
        Customer customer = findCustomerByName(customerName);
        Product productToSell = findProductByName(product.getName());

        if (customer == null) {
            System.out.println("Покупатель не найден.");
            return;
        }

        if (productToSell == null) {
            System.out.println("Продукт не найден.");
            return;
        }

        if (!isCustomerAge(customer)) {
            System.out.println("Продажа запрещена: покупатель младше 18 лет.");
            return;
        }

        if (isProductExpired(productToSell)) {
            System.out.println("Продажа запрещена: продукт просрочен.");
            return;
        }

        System.out.println("Продан продукт " + productToSell.getName() + " покупателю " + customer.getName());
    }


    private boolean isCustomerAge() {

       return 18 < passport.getAge().getYear();
    }

    private void isProductExpired() {
        for (Product p:
             products) {
            if (p.getData().getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                
            }
        }


    }
}


