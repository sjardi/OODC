package Week1.practicum2;

/**
 * Created by Ashwin on 04-Feb-16.
 */
public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm) {
        naam = nm;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten() {
        return ((aantalGewonnen * 3) + (aantalGelijk));
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen += 1;
        if (ch == 'g')
            aantalGelijk += 1;
        if (ch == 'v')
            aantalVerloren += 1;
    }

    public String toString() {
        return naam + "\t" + aantalGespeeld() + "\t\t" + aantalGewonnen + "\t" + aantalGelijk + "\t" + aantalVerloren +
                "\t\t" + aantalPunten();
    }
}
