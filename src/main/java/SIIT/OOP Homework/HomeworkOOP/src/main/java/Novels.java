import java.util.ArrayList;

public class Novels extends Books {
    int index;
    final String genre;

    public Novels(String name, int nrOfPages, String genre) {
        super(name, nrOfPages);
        this.genre = genre;

    }


    public String getGenre() {

        return  genre;
    }


    @Override
    public String toString() {
        return super.toString()+" Novel genre "+ genre;
    }
}

