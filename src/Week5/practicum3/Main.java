package Week5.practicum3;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ashwin on 13-Mar-16.
 */
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Naam bronbestand (zonder .txt): ");
        String naamBronBestand = scanner.nextLine() + ".txt";

        // Geeft geen exception als bestand al bestaat, waarom?
        File bestemmingsBestand = null;
        try {
            System.out.print("Naam bestemmingsbestand (zonder .txt): ");
            String naamBestemmingsBestand = scanner.nextLine() + ".txt";
            bestemmingsBestand = new File("src/Week5/practicum3/" + naamBestemmingsBestand);
            bestemmingsBestand.createNewFile();
        } catch (FileAlreadyExistsException fae) {
            System.out.println("Bestemmingsbestand bestaat al!");
			System.exit(0);
        }

        double koers = 1.0;
        try {
            System.out.print("USD/EUR koers (0.98 i.p.v. 98.0): ");
            koers = scanner.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Ongeldige invoer!");
			System.exit(0);
        }

        scanner.close();

        File bronBestand = new File("src/Week5/practicum3/" + naamBronBestand);
        if(bronBestand.exists() && bronBestand.isFile() && bronBestand.canRead() &&
                bestemmingsBestand.exists() && bestemmingsBestand.isFile() && bestemmingsBestand.canWrite()) {

            FileReader frBron = new FileReader(bronBestand);
            BufferedReader brBron = new BufferedReader(frBron);
            FileWriter fwBestemming = new FileWriter(bestemmingsBestand);
            PrintWriter pwBestemming = new PrintWriter(fwBestemming);

            String regelBron = brBron.readLine();
            while (regelBron != null) {
                String[] values = regelBron.split(" : ");
                String naam = values[0];
                double prijs = Double.parseDouble(values[1]);
                double omgezettePrijs = prijs * koers;

                pwBestemming.printf(naam + " : %.2f%n", omgezettePrijs);

//                System.out.printf(naam + " : " + prijs + " : %.2f%n", omgezettePrijs);

                regelBron = brBron.readLine();
            }
            pwBestemming.close();
            brBron.close();
        }
    }
}
