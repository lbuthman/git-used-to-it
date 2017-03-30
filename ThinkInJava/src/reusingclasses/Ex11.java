package reusingclasses;

/**
 * Created by lbuthman on 3/29/17.
 * delegate functions from Cleanser in Ex2 to Detergent
 */
class DetergentDelegate {

    private String brand;
    private Cleanser cleanser = new Cleanser();

    DetergentDelegate(String name) {
        this.brand = name;
    }

    //delegated methods
    public void append(String s) {
        brand += s;
    }

    public void dilute() {
        cleanser.dilute();
        System.out.println(cleanser.toString());
    }

    public void apply() {
        cleanser.apply();
        System.out.println(cleanser.toString());
    }

    public void scrub() {
        cleanser.scrub();
        System.out.println(cleanser.toString());
    }

    public String toString() {
        return brand;
    }
}

public class Ex11 {
    public static void main(String[] args) {

        DetergentDelegate detergent = new DetergentDelegate("super clean");
        detergent.append(" is WOW!");
        System.out.println(detergent.toString());
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        System.out.println(detergent.toString() + " works every time!");
    }
}
