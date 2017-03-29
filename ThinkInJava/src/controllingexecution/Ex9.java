package controllingexecution;

/**
 * Created by lbuthman on 3/19/17.
 */
public class Ex9 {

    public static String fib(int n) {

        String fib = "";
        int prev = 0;
        int current = 1;
        int temp;

        for (int i=1; i<n; i++) {

            switch(i) {
                case 1:
                    fib += "1";
                    break;
                default:
                    fib += ", " + (prev + current);
                    temp = current;
                    current = prev + current;
                    prev = temp;
            }
        }

        return fib;

    }

    public static void main(String[] args) {

        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(10));
    }
}
