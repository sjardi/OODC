package Week2.practicum1;

/**
 * Created by Ashwin on 09-Feb-16.
 */
public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr) {
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb) {
        huisbaas = hb;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas.toString();
    }

}
