package initializationandcleanup;

/**
 * Created by lbuthman on 3/22/17.
 *
 * demonstrate static initialization
 */
public class Ex14 {

    static String string1 = "hello";
    static String string2;

    static {
        string2 = "goodbye";
    }

    static void stringCall() {
        System.out.println(string1);
        System.out.println(string2);
    }

    public static void main(String[] args) {

        Ex14.stringCall();
    }
}
