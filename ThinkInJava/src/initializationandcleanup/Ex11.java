package initializationandcleanup;

/**
 * Created by lbuthman on 3/21/17.
 */
public class Ex11 {
    public static void main(String[] args) {

        //Tank tank = new Tank();
        //tank.fillUp(16.5);

        new Tank();

        System.gc();

    }

}

