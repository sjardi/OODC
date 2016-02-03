package Week1.les1.opdracht5;

/**
 * Created by Ashwin on 03-Feb-16.
 */
public class Student {
    private String naam;
    private int studentNummer;

    public Student(String nm) {
        naam = nm;
    }

    public Student(String nm, int stNr) {
        naam = nm;
        studentNummer = stNr;
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int stnr) {
        studentNummer = stnr;
    }

    public String toString() {
        String s = "Deze student heet " + naam + " en heeft nummer: " + studentNummer;
        return s;
    }

}
