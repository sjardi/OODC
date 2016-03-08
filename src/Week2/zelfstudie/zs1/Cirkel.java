package Week2.zelfstudie.zs1;

/**
 * Created by Ashwin on 08-Mar-16.
 */
public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        radius = rad;
        xPositie = x;
        yPositie = y;

        if (radius <= 0) {
            throw new IllegalArgumentException("Negatieve radius is onmogelijk!");
        }

    }

    public String toString() {
        return "cirkel("+ xPositie + ", " + yPositie +") met radius: " +radius;
    }

}
