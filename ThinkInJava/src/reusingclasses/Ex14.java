package reusingclasses;

/**
 * Created by lbuthman on 3/30/17.
 */

class Coffee {
    int sip(int i) {
        System.out.println("sipping " + i + " little sips");
        return i;
    }
    double sip(double i) {
        System.out.println("sipping " + i + " big sips");
        return i;
    }
    String sip(String i) {
        System.out.println("where did my coffee go? " + i);
        return i;
    }
}

class HouseBlend extends Coffee {
    float sip(float i) {
        System.out.println("sipping " + i + " medium sips");
        return i;
    }
}

public class Ex14 {

    public static void main(String[] args) {

        HouseBlend house = new HouseBlend();
        double cup = 100;

        while (cup > 0) {
            cup -= house.sip(2);
            cup -= house.sip(4.5);
            cup -= house.sip(3.3f);
        }
        house.sip(" I drank it all!");

    }
}
