package Service;

import Interface.LibraryService;
import Model.DataBase;
import Model.Library;

import java.util.List;

public class Libraryimpl implements LibraryService {
    private DataBase dataBase;


    public Libraryimpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        dataBase.getLibraries().addAll(libraries);
        return dataBase.getLibraries();

    }

    @Override
    public List<Library> getAllLibraries() {
        List<Library> libraries = getAllLibraries();
        return dataBase.getLibraries();

    }


    @Override
    public Library getLibraryById(Long id) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++)
            if (dataBase.getLibraries().get(i).getInstanceId() == (id)) {
                return dataBase.getLibraries().get(i);
            }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        boolean found = false;
        for (Library t : dataBase.getLibraries()) {
            if (t.getInstanceId() == id) found = true;
            if (found) {
                t.setAddress(library.getAddress());
                t.setBooks(library.getBooks());
                t.setName(library.getName());
                return t;
            } else {
                System.out.println("invalid");
            }
        }
        return library;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (Library library : dataBase.getLibraries()) {
            if (library.getInstanceId() == (id)) {
                dataBase.getLibraries().remove(library);
                return "Library is successfully deleted:";
            }
        }
        return "invalid";
    }
}