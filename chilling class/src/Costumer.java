import java.util.Arrays;
    public  class Costumer {
        private String name;
        Passport passports;
        Product[] products;
        Bank banks;
        Costumer[] costumers;

        public Costumer(String name, Passport passports, Product[] products, Bank banks) {
            this.name = name;
            this.passports = passports;
            this.products = products;
            this.banks = banks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Passport getPassports() {
            return passports;
        }

        public void setPassports(Passport passports) {
            this.passports = passports;
        }

        public Product[] getProducts() {
            return products;
        }

        public void setProducts(Product[] products) {
            this.products = products;
        }

        public Bank getBanks() {
            return banks;
        }

        public void setBanks(Bank banks) {
            this.banks = banks;
        }

        public void deleteProductByName(String customerName, String productName) {
            if (!name.equals(customerName)) {
                System.out.println("Покупатель не найден");
                return;
            }

            for (int i = 0; i < products.length; i++) {
                if (products[i] != null && products[i].getName().equals(productName)) {
                    products[i] = null;
                    System.out.println("Продукт удален: " + productName);
                    return;
                }
            }

            System.out.println("Продукт не найден");
        }

        public Product[] addProduct(Product productName) {
            for (Product pp : products) {
                if (pp != null && pp.getName().equals(productName.getName())) {
                    System.out.println("Продукт уже существует");
                }
            }
            Product[] ppp = Arrays.copyOf(products, products.length + 1);
            ppp[products.length] = productName;
            products = ppp;
            System.out.println("Продукт добавлен: " + productName.getName());
            return ppp;
        }

        @Override
        public String toString() {
            return "Costumer{" +
                    "name='" + name + '\'' +
                    ", passports=" + passports +
                    ", products=" + Arrays.toString(products) +
                    ", banks=" + banks +
                    '}';
        }
    }
