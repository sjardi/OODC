package Week5.les10;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Ashwin on 10-Mar-16.
 */
public class Main {
    public static void main(String[] args)
            throws IOException {
        FileReader fr = new FileReader("src/Week5/les10/invoer.txt");
        BufferedReader br = new BufferedReader(fr);

        int aantalGetallen = 0;
        double huidigGetal;
        double totaalGetal = 0;
        String regel = br.readLine();
        while (regel != null) {
            String[] values = regel.split("\n");
            String getal = values[0];
            huidigGetal = Double.parseDouble(getal);

            System.out.println(huidigGetal);
            regel = br.readLine();
            aantalGetallen += 1;
            totaalGetal += huidigGetal;
        }
        br.close();
        System.out.println("\n" + aantalGetallen);
        System.out.println("Gemiddelde: " + totaalGetal / aantalGetallen);
    }
}
