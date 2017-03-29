package operators;

/**
 * Created by lbuthman on 3/22/17.
 */
public class Ex17 {

    public Ex17(String s) {

        System.out.println("constructing " + s);

    }

    public static void main(String[] args){

        String s1 = "1";
        String s2 = "2";
        String s3 = "3";

        Object[] ex = {new Ex17(s1)};
    }
}
