package Model;
import Enum.Genre;
public class Book {

    public static int next = 0;
    private int instanceId;
    private String name;
    private String author;
    private Genre genre;

    public Book(String name, String author, Genre genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.instanceId= next++;
    }

    public static int getNext() {
        return next;
    }

    public static void setNext(int next) {
        Book.next = next;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "\nBook{" +
                "instanceId=" + instanceId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                '}';
    }
}
