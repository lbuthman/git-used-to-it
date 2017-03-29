package initializationandcleanup;

/**
 * Created by lbuthman on 3/23/17.
 * create an Enum and iterate over
 */
public class Ex21 {
    public static void main(String[] args) {

        System.out.println("Money money money (make your, make your cashflow flow)");

        for (Paper p: Paper.values()) {
            System.out.println("Mighty might " + p + " dollar bill y'all");
        }
    }
}

enum Paper {
    ONE, FIVE, TEN, TWENTY, FIFTY, BENJAMIN
}
