package controllingexecution;

/**
 * Created by lbuthman on 3/19/17.
 */
public class Ex6 {
    static int test(int testval, int start, int end) {

        if (testval == start || testval == end) {
            return 0; //match
        } else if (testval > start && testval < end) {
            return 1; //between
        } else {
            return -1; //no match
        }
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 15));
    }
}
