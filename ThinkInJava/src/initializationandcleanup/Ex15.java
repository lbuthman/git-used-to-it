package initializationandcleanup;

/**
 * Created by lbuthman on 3/22/17.
 *
 * demonstrate non-static instance initialization
 */
public class Ex15 {

    String s;

    {
        s = "chocolate!";
        System.out.println("I love " + s);
    }

    public static void main(String[] args) {
        new Ex15();
    }
}
