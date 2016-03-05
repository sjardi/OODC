package Week4.practicum1;

import java.time.LocalDate;

/**
 * Created by Ashwin on 05-Mar-16.
 */
public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde() {
        double waarde;
        waarde = Math.pow(0.7, LocalDate.now().getYear() - bouwjaar) * nieuwprijs;
        return waarde;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObject = false;

        if (obj instanceof Auto) {
            Auto andereAuto = (Auto) obj;

            if (this.kenteken.equals(andereAuto.kenteken)) {
                gelijkeObject = true;
            }
        }
        return gelijkeObject;
    }
}
