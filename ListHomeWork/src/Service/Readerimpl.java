package Service;
import Interface.ReaderService;
import Model.DataBase;
import Model.Reader;

import java.util.ArrayList;
import java.util.List;

public class Readerimpl implements ReaderService {

  private DataBase dataBase;
    public Readerimpl(DataBase dataBase) {
        this.dataBase = dataBase;

    }

    @Override
    public void saveReader(Reader reader) {
        dataBase.getReaders().add(reader);
            System.out.println(dataBase.getReaders());

        }
    @Override
    public List<Reader> getAllReaders() {
        List<Reader> allReaders = new ArrayList<>();
        for (Reader r: dataBase.getReaders()) {
            allReaders.add(r);
        }
          return allReaders;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (int i = 0; i < dataBase.getReaders().size() ; i++) {
        return (Reader) dataBase.getReaders();
        }

        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {


        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {

    }
}
