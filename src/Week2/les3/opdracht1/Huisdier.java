package Week2.les3.opdracht1;

/**
 * Created by Ashwin on 07-Feb-16.
 */
public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar owner;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public void setBaasje(Eigenaar e) {
        owner = e;
    }

    public Eigenaar getBaasje() {
        return owner;
    }

    public String getNaam() {
        return naam;
    }

    public String getRas() {
        return ras;
    }

    public String toString() {
        String s = naam + ", de " + ras + ", weegt " + gewicht + " kg.\n";
        if (owner == null) {
            s = s + "En de eigenaar is: null";
        }
        else {
            s = s + "En de eigenaar is: " + owner.toString();
        }
        return s;
    }

}
