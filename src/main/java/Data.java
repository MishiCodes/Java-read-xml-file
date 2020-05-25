import java.util.List;

/**
 * Represents a dataLists used as a format of data fetched from MySQL database
 *
 * @author Mehwish
 */
public class Data {
    private List<Bar> bars;
    private List<Reviewer> reviews;

    /**
     * Constructor of a ready to work with dataSet containing empty ArrayLists
     */
    public Data() {
        this.bars = new java.util.ArrayList<Bar>();
        this.reviews = new java.util.ArrayList<Reviewer>();
    }

    /**
     * Getters for this class
     */
    public List<Bar> getBars() { return bars; }
    public List<Reviewer> getReviews() { return reviews; }

    /**
     * Setters for this class
     */
    public void setBars(List<Bar> bars) { this.bars = bars; }
    public void setReviews(List<Reviewer> reviews) { this.reviews = reviews; }
}

