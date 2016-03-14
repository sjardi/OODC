package proeftentamen.opdracht1;

/**
 * Created by Ashwin on 13-Mar-16.
 */
public class Opleiding {
    private String naam;
    private String variant;
    private int studieduur;
    private int minimumECs;

    public Opleiding(String nm, int std, int mEs) {
        naam = nm;
        studieduur = std;
        minimumECs = mEs;
        variant = "voltijd";
    }

    public Opleiding(String nm, String v, int std, int mEs) {
        this(nm, std, mEs);
        variant = v;
    }

    public String getNaam() {
        return naam;
    }

    public void setStudieduur(int std) {
        studieduur = std;
    }

    public void wijzigVariant(String v) {
        if (v.equals("voltijd") || v.equals("deeltijd")) {
            variant = v;
        }
    }

    public String toString() {
        String s = naam + " in " + variant +". De studie duurt " + studieduur + " jaar (minimaal " + minimumECs + " EC)";
        return s;
    }
}
