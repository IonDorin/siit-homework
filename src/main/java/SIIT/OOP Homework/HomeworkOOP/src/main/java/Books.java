import java.util.ArrayList;

public class Books extends Library {


    private final String name;
    private final int nrOfPages;


    public Books(String name, int nrOfPages) {

        this.name = name;
        this.nrOfPages = nrOfPages;

    }


    @Override
    public String toString() {
        return name + " " + nrOfPages;
    }


    public static void listbooks(ArrayList<Books> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("At index " + i + " we have book " + bookList.get(i));
        }
    }


    public static void deleteBooks(ArrayList<Books> bookList, Books book) {

        bookList.remove(book);
        System.out.println(bookList);
    }
}