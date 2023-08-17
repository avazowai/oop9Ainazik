public class Newspaper extends News implements Readable{
    public Newspaper(String name, String pages) {
        super(name, pages);

    }

    @Override
    public void read() {
        System.out.println("Dead sea");
    }

    @Override
    public String toString() {
        return "Newspaper{}";
    }
}
