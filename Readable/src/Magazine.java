public class Magazine extends News implements Readable {

    public Magazine(String name, String pages) {
        super(name, pages);
    }

    @Override
    public void read() {
        System.out.println("the best music is the zubi" );
    }
}