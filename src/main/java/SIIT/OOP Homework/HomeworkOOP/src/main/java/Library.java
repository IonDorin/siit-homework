import java.util.ArrayList;


public class Library  {

    public static void main(String[] args) {

        ArrayList<Books> bookList = new ArrayList<>();
        Books book1 = new Novels("Tom Sawyer", 200, "Fantasy");
        Books book2 = new Novels(" The House of Mirth", 500, "Mystery");
        Books book3 = new Albums(" Absalom", 352, 8);
        Books book4 = new Albums("A Scanner Darkly", 346, 3);
        Books book5 = new Novels("East of Eden", 462, "Thriller");
        Books book6 = new Novels("The Sun Also Rises", 382, "Romance");
        Books book7 = new Albums("Vile Bodies", 496, 10);
        Books book8 = new Albums("Greatest Art Albums",120,5);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);



        Books.listbooks(bookList);

        System.out.println("Books added ");


        bookList.add(Books.addBook("Huckleberry Finn", 354,"Fantasy"));
        bookList.add(Books.addBook("Picasso Art Album",139,9));
        Books.listbooks(bookList);



        System.out.println("After deleted book");
        Books.deleteBooks(bookList,book1);


    }




    }






