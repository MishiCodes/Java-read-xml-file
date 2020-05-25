/**
 * Represents the individual entries of bar from the XML file
 *
 * @author Mehwish
 */
public class Bar {
    private String sn;
    private String name;
    private double fett;
    private double energy;
    private double kolhydrat;
    private double protein;
    private double fiber;

    /**
     * Getters for this class
     */
    public String getSn() { return sn; }
    public String getName() { return name; }
    public double getFett() { return fett; }
    public double getEnergy() { return energy; }
    public double getKolhydrat() { return kolhydrat; }
    public double getProtein() { return protein; }
    public double getFiber() { return fiber; }

    /**
     * Setters for this class
     */
    public void setSn(String sn) { this.sn = sn; }
    public void setName(String name) { this.name = name; }
    public void setFett(double fett) { this.fett = fett; }
    public void setEnergy(double energy) { this.energy = energy; }
    public void setKolhydrat(double kolhydrat) { this.kolhydrat = kolhydrat; }
    public void setProtein(double protein) { this.protein = protein; }
    public void setFiber(double fiber) { this.fiber = fiber; }

    @Override
    public String toString() {
        return "Bar [SN=" + sn + ", name=" + name + ", fett=" + fett + ", energy=" + energy +
                ", kolhydrat=" + kolhydrat + ", protein=" + protein + ", fiber=" + fiber + "]";
    }
}
