package operators;

/**
 * Created by lbuthman on 3/16/17.
 */
public class Ex8 {
    public static void main(String[] args) {

        int b1 = 0X4F;
        int b2 = 0X3F;
        int b3 = 0X111F;

        int o1 = 017;
        int o2 = 071;
        int o3 = 0111;

        System.out.println("b1 is " + Integer.toBinaryString(b1));
        System.out.println("b2 is " + Integer.toBinaryString(b2));
        System.out.println("b3 is " + Integer.toBinaryString(b3));

        System.out.println("o1 is " + Integer.toBinaryString(o1));
        System.out.println("o2 is " + Integer.toBinaryString(o2));
        System.out.println("o3 is " + Integer.toBinaryString(o3));
    }
}
