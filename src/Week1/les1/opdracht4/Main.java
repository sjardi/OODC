package Week1.les1.opdracht4;

/**
 * Created by Ashwin on 03-Feb-16.
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Sylvester");
        System.out.println("getter: " + st1.getNaam());
        System.out.println("toString: " + st1.toString());

        Student st2 = new Student("Karel");
        System.out.println("getter: " + st2.getNaam());
        System.out.println("toString: " + st2.toString());
    }
}
