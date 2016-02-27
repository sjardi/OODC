package Week3.les6.opdracht2;

import java.util.ArrayList;

/**
 * Created by Ashwin on 27-Feb-16.
 */
public class FacebookAccount {
    ArrayList<Vriend> vrienden = new ArrayList<Vriend>();
    private String naam;

    public FacebookAccount(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend nwV) {
        if (vrienden.contains(nwV)) {
            System.out.println("Komt al voor in de lijst!");
        } else {
            vrienden.add(nwV);
        }
    }

    public boolean verwijderVriend(Vriend exV) {
        boolean kanVerwijderen = false;
        if (vrienden.remove(exV)) {
            kanVerwijderen = true;
        }
        return kanVerwijderen;
    }

    public boolean isVriendMet(Vriend v) {
        boolean isVriend = false;
        if (vrienden.contains(v)) {
            isVriend = true;
        }
        return isVriend;
    }

    public int aantalVrienden() {
        return vrienden.size();
    }

    public String toString() {
        System.out.println(naam + " heeft " + aantalVrienden() + " vrienden:");
        vrienden.forEach(vriend -> System.out.println(vriend));
        return null;
    }
}
