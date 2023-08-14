public class Phone {
    private String brand ;
    private String Version;
    private String screen;
    private String memory;
    private int price;

    public Phone(String brand, String version, String screen, String memory, int price) {
        this.brand = brand;
        Version = version;
        this.screen = screen;
        this.memory = memory;
        this.price = price;

    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", Version='" + Version + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", price=" + price +
                '}';
    }
}
