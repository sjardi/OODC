package proeftentamen.opdracht2;

/**
 * Created by Ashwin on 14-Mar-16.
 */
public abstract class Voertuig {
    private String type;
    protected int maximumSnelheid;
    protected int huidigeSnelheid;

    public Voertuig(String tp, int mS) {
        type = tp;
        maximumSnelheid = mS;
        huidigeSnelheid = 0;
    }

    public abstract void snelheidVerhogen();

    public abstract void snelheidVerlagen();

    public String toString() {
        String s = type;
        return s;
    }
}
