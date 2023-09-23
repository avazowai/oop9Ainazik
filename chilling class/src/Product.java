public class Product {
    private String name;
    private String description;
    private int price;
    private int count;
    private double madelDate;
    private String  isAlcaholic;
    public Product(String name, String description, int price, int count, double madelDate, String isAlcaholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
        this.madelDate = madelDate;
        this.isAlcaholic = isAlcaholic;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getMadelDate() {
        return madelDate;
    }

    public void setMadelDate(double madelDate) {
        this.madelDate = madelDate;
    }

    public String getIsAlcaholic() {
        return isAlcaholic;
    }

    public void setIsAlcaholic(String isAlcaholic) {
        this.isAlcaholic = isAlcaholic;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", madelDate=" + madelDate +
                ", isAlcaholic='" + isAlcaholic + '\'' +
                '}';
    }
}
