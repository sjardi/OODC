package Week2.zelfstudie.zs3;

/**
 * Created by Ashwin on 08-Mar-16.
 */
public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (CirkelException ce) {
            System.out.println(ce.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
