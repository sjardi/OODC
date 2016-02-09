package Week2.practicum2;

/**
 * Created by Ashwin on 09-Feb-16.
 */
public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {

    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        double prijs = (gehuurdeAuto.getPrijsPerDag() * aantalDagen) * ((100 - huurder.getKorting()) / 100) ;
        return prijs;
    }

    public String toString() {
        String s;

        if (huurder == null || gehuurdeAuto == null) {
            s = "\ter is geen auto bekend\n\ter is geen huurder bekend\n\taantal dagen: 0 en dat kost 0.0";
        }
        else {
            s = "\tautotype: " + gehuurdeAuto.toString() + "\n\top naam van: " + huurder.toString() + "\n\taantal dagen: " + aantalDagen + " en dat kost " +totaalPrijs();
        }

        return s;
    }

}
