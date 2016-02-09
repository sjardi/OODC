package Week2.practicum3;

import java.util.ArrayList;

/**
 * Created by Ashwin on 09-Feb-16.
 */
public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    public Klas(String kC) {
        klasCode = kC;
        deLeerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling ll : deLeerlingen) {
            if (ll.getNaam().equals(nm)) {
                ll.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    public String toString() {
        String s;
        s = "In klas "+ klasCode + " zitten de volgende leerlingen:\n";
        for (Leerling ll : deLeerlingen) {
            s = s + ll.getNaam() + " heeft cijfer: " + ll.getCijfer() + "\n";
        }
        return s;
    }

}
