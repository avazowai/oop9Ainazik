public class Flower {
    private String flowerName ;
    private int freshness;
    private int price;

    public Flower(String flowerName, int freshness, int price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;

    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
