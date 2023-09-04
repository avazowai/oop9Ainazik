package Service;
import Interface.BookService;
import Model.Book;
import Model.DataBase;
import Model.Library;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bookimpl implements BookService {
    private DataBase dataBase;

    public Bookimpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public Book saveBook(Long libraryId, Book book) {
        for (int i = 0; i < dataBase.getBooks().size(); i++) {
            if (dataBase.getLibraries().get(i).equals(libraryId)) {
                dataBase.getLibraries().get(i).getBooks().add(book);
            }
            return book;
        }
        return null;
    }


    @Override
    public List<Book> getAllBooks(Long libraryId) {
        for (Library lib : dataBase.getLibraries()) {
            if (lib.getInstanceId() == libraryId) {
            }
        }
        return null;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).getInstanceId() == bookId) {
                return dataBase.getBooks().get(i);
            }

        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).getInstanceId() == bookId) {
                // return deleteBook().get(i);
            }
        }
        return null;

    }

    @Override
    public String clearBooksByLibraryId(Long libraryId) {
        for (Library library : dataBase.getLibraries()) {
            if (library.getInstanceId() == libraryId) {
                library.getBooks().clear();
                System.out.println(library);
            }
        }
        return null;
    }
}