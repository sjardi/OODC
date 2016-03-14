package proeftentamen.opdracht2;

/**
 * Created by Ashwin on 14-Mar-16.
 */
public class Main {
    public static void main(String[] args) {
        Trein t1 = new Trein("Tokyo Train 10000 series", 360);

        System.out.println(t1);
        t1.setVeiligheidsModus(true);

        for (int i = 0; i < 8; i++) {
            t1.snelheidVerhogen();
        }

        System.out.println(t1);
        t1.snelheidVerhogen();
        t1.snelheidVerhogen();
        System.out.println(t1);
    }
}
