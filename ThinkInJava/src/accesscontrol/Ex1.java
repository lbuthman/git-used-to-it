package accesscontrol;

import operators.*;

/**
 * Created by lbuthman on 3/26/17.
 * create instance of class outside of package
 */
public class Ex1 {

    public static void main(String[] args) {

        Ex7 coin = new Ex7();

        int heads = 0;
        int tails = 0;

        for (int i=0; i<100; i++) {
            if (coin.flip().equals("heads")) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Best out of 100 - Heads: " + heads + " Tails: " + tails);
    }
}
