package operators;

/**
 * Created by lbuthman on 3/19/17.
 */
public class Ex14 {

    public static void boolString(String s, String t) {

        boolean x = false;

        System.out.println("******" + s + " " + t + "******");
        System.out.print("s.equals(t) ");
        System.out.println(s.equals(t));
        System.out.print("!s.equals(t) ");
        System.out.println(!s.equals(t));
        System.out.print("s.equals(t) && t.equals(s) ");
        System.out.println(s.equals(t) && t.equals(s));
        System.out.print("s.equals(t) || t.equals(s) ");
        System.out.println(s.equals(t) || t.equals(s));
        System.out.print("s.equals(t) & t.equals(s) ");
        System.out.println(s.equals(t) & t.equals(s));
        System.out.print("s.equals(t) | t.equals(s) ");
        System.out.println(s.equals(t) | t.equals(s));
        System.out.print("s.equals(t) ^ t.equals(s) ");
        System.out.println(s.equals(t) ^ t.equals(s));
        x &= s.equals(t);
        System.out.println("x &= s.equals(t) " + x);
        x |= s.equals(t);
        System.out.println("x |= s.equals(t) " + x);
        x ^= s.equals(t);
        System.out.println("x ^= s.equals(t) " + x);

    }

    public static void main(String[] args) {

        boolString(new String( "hello"), new String( "goodbye"));
        boolString(new String( "hello"), new String( "hello"));
        boolString(new String( "123"), new String( "321"));
        boolString(new String( "123"), new String( "123"));
        boolString(new String( "&*("), new String( "&*("));

    }
}
