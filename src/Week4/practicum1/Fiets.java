package Week4.practicum1;

import java.time.LocalDate;

/**
 * Created by Ashwin on 05-Mar-16.
 */
public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        double waarde;
        waarde = Math.pow(0.9, LocalDate.now().getYear() - bouwjaar) * nieuwprijs;
        return waarde;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObject = false;

        if (obj instanceof Fiets) {
            Fiets andereFiets = (Fiets) obj;

            if (this.framenummer == andereFiets.framenummer) {
                gelijkeObject = true;
            }
        }
        return gelijkeObject;
    }
}
