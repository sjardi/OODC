package proeftentamen.opdracht2;

/**
 * Created by Ashwin on 14-Mar-16.
 */
public class Trein extends Voertuig {
    private boolean inVeiligheidsModus;

    public Trein(String tp, int mS) {
        super(tp, mS);
    }

    public void setVeiligheidsModus(boolean vM) {
        inVeiligheidsModus = vM;
    }

    public void snelheidVerhogen() {
        if (inVeiligheidsModus && huidigeSnelheid < maximumSnelheid/2) {
            huidigeSnelheid += 20;
        }
    }

    public void snelheidVerlagen() {
        huidigeSnelheid -= 20;
    }

    public String toString() {
        String s = "Trein (veiligheidsmodus: " + (inVeiligheidsModus == true ? "aan)" : "uit)") + " van type " + super.toString() + " rijdt nu " + huidigeSnelheid + " (max.: " + maximumSnelheid + ")";
        return s;
    }
}
