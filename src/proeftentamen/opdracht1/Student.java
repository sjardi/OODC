package proeftentamen.opdracht1;

/**
 * Created by Ashwin on 13-Mar-16.
 */
public class Student {
    private String naam;
    private int leeftijd;
    private Opleiding mijnOpleiding;

    public Student(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }

    public Opleiding getOpleiding() {
        return mijnOpleiding;
    }

    public void setOpleiding(Opleiding opl) {
        mijnOpleiding = opl;
    }

    public String toString() {
        String s = "Student " + naam + " volgt ";
        if (mijnOpleiding == null) {
            s = s + "nog geen opleiding";
        } else {
            s = s + "de opleiding " + getOpleiding();
        }
        return s;
    }
}
