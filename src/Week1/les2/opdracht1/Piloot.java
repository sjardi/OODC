package Week1.les2.opdracht1;

/**
 * Created by Ashwin on 04-Feb-16.
 */
public class Piloot {
    private String naam;
    private int vlieguren = 0;
    private double salaris = 0;

    public Piloot(String nm) {
        naam = nm;
    }

    public void setSalaris(double sl) {
        salaris = sl;
    }

    public void verhoogVliegurenMet(int uur) {
        vlieguren = uur;
    }

    public String getNaam() {
        return naam;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public double getSalaris() {
        return salaris;
    }

    public String toString() {
        String s = naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
        return s;
    }
}
