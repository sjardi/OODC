package Week1.practicum1;

/**
 * Created by Ashwin on 04-Feb-16.
 */
public class Zwembad {
    private double breedte = 0;
    private double lengte = 0;
    private double diepte = 0;

    public Zwembad(double br, double ln, double dp) {
        breedte = br;
        lengte = ln;
        diepte = dp;
    }

    public Zwembad() {

    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        return lengte * breedte * diepte;
    }

    public void setBreedte(double br) {
        breedte = br;
    }

    public void setLengte(double ln) {
        lengte = ln;
    }

    public void setDiepte(double dp) {
        diepte = dp;
    }

    public String toString() {
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        return s;
    }

}
