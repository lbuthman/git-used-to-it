package operators;

/**
 * Created by lbuthman on 3/15/17.
 */
class Moat {

    double moatWidth;
}

public class Ex2 {
    public static void main(String[] args) {

        //create two Moats and assign their width value to magic numbers
        Moat c1 = new Moat();
        Moat c2 = new Moat();
        c1.moatWidth = 12.23;
        c2.moatWidth = 24.43;

        //print assignments to standard output
        System.out.println("Castle 1's moat is " + c1.moatWidth + " feet wide.");
        System.out.println("Castle 2's moat is " + c2.moatWidth + " feet wide.");


        //assign the reference of c2 to c1, and print output
        c2 = c1;
        System.out.println("Castle 1's moat is " + c1.moatWidth + " feet wide.");
        System.out.println("Castle 2's moat is " + c2.moatWidth + " feet wide.");

        //widen castle 1's moat and castle 2 refers to 1 still
        c1.moatWidth = 14.54;
        System.out.println("Castle 1's moat is " + c1.moatWidth + " feet wide.");
        System.out.println("Castle 2's moat is " + c2.moatWidth + " feet wide.");

    }

}
