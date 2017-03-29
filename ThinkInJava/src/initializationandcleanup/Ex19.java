package initializationandcleanup;

/**
 * Created by lbuthman on 3/23/17.
 */
public class Ex19 {

    public static void varargs(String ... s) {

        for (String a: s) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        varargs("a", "b", "c");

        String[] strings = {"1", "2", "3"};
        varargs(strings);

    }
}
