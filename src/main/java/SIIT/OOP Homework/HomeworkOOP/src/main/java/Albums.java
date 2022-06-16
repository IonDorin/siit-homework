public class Albums extends Books {
    int index;
     final String paperQuality;

    public Albums( int index,String name, int nrOfPages,String paperQuality) {
        super(name, nrOfPages);
        this.paperQuality = paperQuality;
        this.index =index;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    @Override
    public String toString() {
        return super.toString() +" Art album paper quality  " +paperQuality;
    }
}
