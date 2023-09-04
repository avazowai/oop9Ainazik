import Model.Book;
import Model.DataBase;
import Model.Library;
import Model.Reader;
import Enum.Genre;
import Enum.Gender;
import Service.Bookimpl;
import Service.Libraryimpl;
import Service.Readerimpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           ArrayList<Book>books = new ArrayList<>(
                   List.of(new Book("If you not first,than you last","Grand Cardone", Genre.COMEDY),
                           new Book("love you baby","Phill Knight",Genre.COMEDY),
                           new Book("Come back","Jake Hilson",Genre.DRAMA)));
           List<Book>books1 = new ArrayList<>(List.of(books.get(0),books.get(1),books.get(2)));

           ArrayList<Reader> readers = new ArrayList<>(
               List.of(new Reader("Aigerim Avazbekova","aigerim@",343, Gender.FEMALE),
                       new Reader("Aidai Takipova","aidai@",767,Gender.FEMALE),
                       new Reader("Shakir","shakir@",333,Gender.MAlE)));
           List<Reader>readers1 = new ArrayList<>(List.of(readers.get(0),readers.get(1),readers.get(2)));

      ArrayList<Library> libraries = new ArrayList<>(
              List.of(new Library ("Bayal","Prospect Chyi",books,readers),
                      new Library ("Awaw","Prospect Lenina",books,readers),
                      new Library("SoS","New city street",books,readers)));
      List<Library> libraries1 = new ArrayList<>(List.of(libraries.get(0),libraries.get(1),libraries.get(2)));

           DataBase dataBase = new DataBase(libraries,books,readers);

           Libraryimpl libraryimpl = new Libraryimpl(dataBase);
           Bookimpl bookimpl = new Bookimpl(dataBase);
           Readerimpl readerimpl = new Readerimpl(dataBase);

           int b = 0 ;
           while (b<=15){
           int s = new Scanner(System.in).nextInt();

           switch (s) {
               case 1 :
                   System.out.println("Library are saved:");
                   System.out.println(libraryimpl.saveLibrary(libraries1));
               case 2:
                   System.out.println("The library was gotten from id");
                   System.out.println(libraryimpl.getLibraryById(1L));
               case 3:
                   System.out.println("The library id succesfully updated");
                   System.out.println(libraryimpl.updateLibrary(1L,new Library("AIS", "Stutgart23",books1,readers1)));
               case 4 :
                   System.out.println("The library was deleted succcesfully");
                   System.out.println(libraryimpl.deleteLibrary(2L));
               case 5 :
                   System.out.println("Saved book");
                   System.out.println(bookimpl.saveBook(1L,new Book("Pandora","Aigerim",Genre.COMEDY)));
               case 6 :
                   System.out.println("Get all books");
                   System.out.println(bookimpl.getAllBooks(1L));
               case 7 :
                   System.out.println("Get book by id");
                   System.out.println(bookimpl.getBookById(1L,1L));
               case 8 :
                   System.out.println("The book was deleted succesfully");
                   System.out.println(bookimpl.deleteBook(3L,2L));
               case 9 :
                   System.out.println("Clear book by library id");
                   System.out.println(bookimpl.clearBooksByLibraryId(2L));
           }
           }
           }
           }





