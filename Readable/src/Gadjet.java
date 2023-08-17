public class Gadjet extends News implements Readable{

    public Gadjet(String name, String pages) {
        super(name, pages);
    }

    @Override
    public void read() {
        System.out.println("Iphone");
    }
}
