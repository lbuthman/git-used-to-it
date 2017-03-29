package operators;

import java.util.*;

/**
 * Created by lbuthman on 3/15/17.
 */

public class Ex7 {

    String side = "";   //one of two values: heads or tails

    public String flip() {

        Random rand = new Random();
        boolean b = rand.nextBoolean();

        if (b) {
            side = "heads";
        } else {
            side = "tails";
        }

        return side;
    }
}
/*
public class Ex7 {
    public static void main(String[] args) {

        Coin coin = new Coin();
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
}*/
