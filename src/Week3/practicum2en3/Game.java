package Week3.practicum2en3;

import java.time.LocalDate;

/**
 * Created by Ashwin on 28-Feb-16.
 */
public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rj, double nwpr) {
        naam = nm;
        releaseJaar = rj;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        double waarde;
        waarde = Math.pow(0.7, LocalDate.now().getYear() - releaseJaar) * nieuwprijs;
        return waarde;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) &&
                    this.releaseJaar == andereGame.releaseJaar && this.nieuwprijs == andereGame.nieuwprijs) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        return "\t"+naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwprijs + " nu voor: \u20AC" + huidigeWaarde() + "\n";
    }
}
