package Week4.practicum1;

import java.util.ArrayList;

/**
 * Created by Ashwin on 05-Mar-16.
 */
public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g) {
        if ((budget >= g.huidigeWaarde()) &&
            (!alleGoederen.contains(g))) {
            budget -= g.huidigeWaarde();
            alleGoederen.add(g);
        }
    }

    public String toString() {
        String s = bedrijfsnaam + " met inventaris:\n";
        for (Goed g : alleGoederen) {
            s += g.toString();
        }
        return s;
    }
}
