import java.util.ArrayList;


public class Library  {


    public static void main(String[] args) {


        ArrayList<Books> bookList = new ArrayList<>();
        Books book1 = new Novels(1,"Tom Sawyer", 200, "Fantasy");
        Books book2 = new Novels(2," The House of Mirth", 500, "Mystery");
        Books book3 = new Albums(3," Absalom", 352, "Good");
        Books book4 = new Albums(4,"A Scanner Darkly", 346, "Bad");
        Books book5 = new Novels(5,"East of Eden", 462, "Thriller");
        Books book6 = new Novels(6,"The Sun Also Rises", 382, "Romance");
        Books book7 = new Albums(7,"Vile Bodies", 496, "Very good");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        Books.listbooks(bookList);

        System.out.println("After deleted book");
        Books.deleteBooks(bookList,book1);
    }



}
