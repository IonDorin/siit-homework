import java.util.ArrayList;

public class Albums extends Books {
     private final int paperQuality;

    public Albums( String name, int nrOfPages,int paperQuality) {
        super(name, nrOfPages);
        this.paperQuality = paperQuality;
    }



  public static void listAlbums(ArrayList<Albums> booklist){
      for (Albums albums : booklist) {

          System.out.println("Albums are: " + albums);
      }
      }


    /**
    public static void listAlbums(ArrayList<Albums> booklist){
        System.out.println((booklist));
    }
     **/
    @Override
    public String toString() {
        return super.toString() +" Art album paper quality  " +paperQuality;
    }
}
