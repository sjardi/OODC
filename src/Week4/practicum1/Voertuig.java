package Week4.practicum1;

/**
 * Created by Ashwin on 05-Mar-16.
 */
public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObject = false;

        if (obj instanceof Voertuig) {
            Voertuig anderVoertuig = (Voertuig) obj;

            if (this.type.equals(anderVoertuig.type) &&
                this.nieuwprijs == anderVoertuig.nieuwprijs &&
                this.bouwjaar == anderVoertuig.bouwjaar) {
                gelijkeObject = true;
            }
        }
        return gelijkeObject;
    }

    public String toString() {
        String s = "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + huidigeWaarde() + "\n";
        return s;
    }
}
