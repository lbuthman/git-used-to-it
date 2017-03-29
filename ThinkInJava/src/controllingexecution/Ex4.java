package controllingexecution;

/**
 * Created by lbuthman on 3/19/17.
 */
public class Ex4 {

    public static void main(String[] args) {

        for (int i=2; i<100; i++) {
            for (int j=2; j<100; j++) {

                if (i == j) {
                    System.out.println("Prime " + i);
                    break;
                }

                if (i % j == 0) {
                    break;
                }
            }
        }
    }
}
