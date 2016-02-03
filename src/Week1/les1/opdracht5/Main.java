package Week1.les1.opdracht5;

/**
 * Created by Ashwin on 03-Feb-16.
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Sylvester");
        System.out.println("naam " + st1.getNaam());
        System.out.println("nummer: " + st1.getStudentNummer());
        st1.setStudentNummer(12345678);
        System.out.println("toString: " + st1.toString());
        System.out.println();

        Student st2 = new Student("Karel", 98765432);
        System.out.println("naam: " + st2.getNaam());
        System.out.println("nummer: " + st2.getStudentNummer());
        System.out.println("toString: " + st2.toString());
    }
}
