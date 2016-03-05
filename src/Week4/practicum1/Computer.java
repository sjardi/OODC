package Week4.practicum1;

import java.time.LocalDate;

/**
 * Created by Ashwin on 05-Mar-16.
 */
public class Computer implements Goed {
    private String type;
    private String MacAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        MacAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde() {
        double waarde;
        waarde = Math.pow(0.6, LocalDate.now().getYear() - productieJaar) * aanschafPrijs;
        return waarde;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObject = false;

        if (obj instanceof Computer) {
            Computer andereComputer = (Computer) obj;

            if (this.type.equals(andereComputer.type) &&
                this.MacAdres.equals(andereComputer.MacAdres) &&
                this.aanschafPrijs == andereComputer.aanschafPrijs &&
                this.productieJaar == andereComputer.productieJaar) {
                gelijkeObject = true;
            }
        }
        return gelijkeObject;
    }

    public String toString() {
        String s = "Computer: " + type + " heeft een waarde van: €" + huidigeWaarde() + "\n";
        return s;
    }
}
