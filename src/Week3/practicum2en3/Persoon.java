package Week3.practicum2en3;

import java.util.ArrayList;

/**
 * Created by Ashwin on 28-Feb-16.
 */
public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public boolean koop(Game g) {
        boolean statusKoop = false;
        if (budget >= g.huidigeWaarde() && !games.contains(g)) {
            games.add(g);
            budget -= g.huidigeWaarde();
            statusKoop = true;
        }
        return statusKoop;
    }

    public boolean verkoop(Game g, Persoon koper) {
        boolean statusVerkoop = false;
        if (games.contains(g) && koper.koop(g)) {
            games.remove(g);
            budget += g.huidigeWaarde();
            statusVerkoop = true;
        }
        return statusVerkoop;
    }

    public Game zoekGameOpNaam(String s) {
        Game gevondenGame = null;
        for (Game g : games) {
            if (g.getNaam().equals(s)) {
                gevondenGame = g;
            }
        }
        return gevondenGame;
    }

    public String toString() {
        String s = naam + " heeft een budget van " + budget + " en bezit de volgende games:\n";
        for (Game g : games) {
            s += g.toString();
        }
        return s;
    }
}
