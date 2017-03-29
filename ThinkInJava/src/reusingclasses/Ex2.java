package reusingclasses;

/**
 * Created by lbuthman on 3/28/17.
 * inheriting classes
 */
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

public class Ex2 extends Detergent {
    //change a method again
    public void scrub() {
        append(" ugh, why won't this stain come out.");
        super.scrub();
        System.out.println(this.toString());
        foam();
    }

    public void foam() {
        System.out.println("That's it. Calling the big guns. FOAM DISPENSE!!");
    }

    public static void main(String[] args) {
        Ex2 e = new Ex2();
        e.scrub();
        Detergent.main(args);

    }
}
