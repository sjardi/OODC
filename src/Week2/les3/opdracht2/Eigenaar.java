package Week2.les3.opdracht2;

/**
 * Created by Ashwin on 07-Feb-16.
 */
public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beest;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setBeestje(Huisdier h) {
        beest = h;
    }

    public Huisdier getBeestje() {
        return beest;
    }

    public void setGiroNr(int nr) {
        giroNr = nr;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        String s = naam + " heeft giro " + giroNr;
        if (beest == null) {
            s = s + ". En is het baasje van null";
        }
        else {
            s = s + ". En is het baasje van " + beest.toString();
        }
        return s;
    }

}
