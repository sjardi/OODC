package proeftentamen.opdracht1;

/**
 * Created by Ashwin on 13-Mar-16.
 */
public class Main {
    public static void main(String[] args) {
        Student st = new Student("Kevin de Wit", 20);
        Opleiding opl = new Opleiding("HBO-ICT", 4, 240);

        System.out.println(opl);
        System.out.println(st);
        st.setOpleiding(opl);
        System.out.println(st);

        opl.wijzigVariant("deeltijd");
        opl.wijzigVariant("duaal");
        opl.setStudieduur(5);
        System.out.println(st);
    }
}
