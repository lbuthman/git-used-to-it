package initializationandcleanup;

/**
 * Created by lbuthman on 3/21/17.
 */
public class Ex10 {
    public static void main(String[] args) {

        Tank tank = new Tank();
        tank.fillUp(16.5);

        new Tank();

        System.gc();

    }

}

class Tank {

    double gasLevel = 0.0;
    final double FUEL_CAPACTIY = 15.0;

    public Tank() {

    }

    public void fillUp(double gas) {

        if (gas > FUEL_CAPACTIY) {
            this.gasLevel = FUEL_CAPACTIY;
            System.out.println("Tank filled with " + (gas - FUEL_CAPACTIY) + " gallon(s) left over.");
        } else {
            this.gasLevel = gas;
            System.out.println("Tank now has " + gas + " gallons of gas.");
        }

    }

    public void finalize() {
        System.out.println("Tank has been left behind.");
    }

}
