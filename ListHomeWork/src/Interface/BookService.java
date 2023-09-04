package Interface;

import Model.Book;
import Model.Library;

import java.util.List;

public interface BookService {
    Book saveBook(Long libraryId,Book book);

    List<Book>getAllBooks(Long libraryId);

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    String clearBooksByLibraryId(Long libraryId);
}
