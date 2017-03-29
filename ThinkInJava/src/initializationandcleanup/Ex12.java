package initializationandcleanup;

/**
 * Created by lbuthman on 3/21/17.
 */
public class Ex12 {
    public static void main(String[] args) {

        TankTerminate tank = new TankTerminate();
        tank.fillUp(16.5);

        new TankTerminate();

        System.gc();

        tank.empty(9.9);

        new TankTerminate();

        System.gc();

        tank.empty(10.3);

        new TankTerminate();

        System.gc();

    }

}

class TankTerminate {

    double gasLevel = 0.0;
    final double FUEL_CAPACTIY = 15.0;

    public TankTerminate() {

    }

    public void fillUp(double gas) {

        if (gas > FUEL_CAPACTIY) {
            gasLevel = FUEL_CAPACTIY;
            System.out.println("Tank filled with " + (gas - FUEL_CAPACTIY) + " gallon(s) left over.");
        } else {
            gasLevel = gas;
            System.out.println("Tank now has " + gas + " gallons of gas.");
        }

    }

    public void empty(double usedGas) {

        if (usedGas > gasLevel) {
            System.out.println("Tank is empty but you still need " + (usedGas - gasLevel) + " gallons of gas.");
            gasLevel = 0.0;

        } else if (usedGas == gasLevel){
            System.out.println("Tank is bone dry!");
            gasLevel = 0.0;

        } else {
            gasLevel -= usedGas;
            System.out.println("Tank still has " + gasLevel + " gallons of gas.");
        }

    }

    public void finalize() {

        if (gasLevel == 0.0) {
            System.out.println("Tank has been thrown away.");
        }
    }

}
