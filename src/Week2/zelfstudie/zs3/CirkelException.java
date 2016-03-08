package Week2.zelfstudie.zs3;

/**
 * Created by Ashwin on 08-Mar-16.
 */
public class CirkelException extends Exception {
    private int radius;

    public CirkelException(int rd) {
        radius = rd;
    }

    public String getMessage() {
        String s = null;

        if (radius <= 0) {
            s += "Negatieve radius is onmogelijk!";
        }

        return s;
    }
}
