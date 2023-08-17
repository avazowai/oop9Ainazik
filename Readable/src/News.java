public class  News {
    private String name;
    private String Pages;

    public News(String name, String pages) {
        this.name = name;
        Pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPages() {
        return Pages;
    }

    public void setPages(String pages) {
        Pages = pages;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                ", Pages='" + Pages + '\'' +
                '}';
    }
}
