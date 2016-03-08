package Week2.zelfstudie.zs3;

/**
 * Created by Ashwin on 08-Mar-16.
 */
public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) throws CirkelException {
        radius = rad;
        xPositie = x;
        yPositie = y;

        if (radius <= 0) {
            throw new CirkelException(radius);
        }

    }

    public String toString() {
        return "cirkel("+ xPositie + ", " + yPositie +") met radius: " +radius;
    }

}
