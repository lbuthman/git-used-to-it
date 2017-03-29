package initializationandcleanup;

/**
 * Created by lbuthman on 3/20/17.
 */
public class Ex9 {

    public static void main(String[] args) {

        new Say();
    }
}

class Say {

    public Say() {
        this("hello");
        System.out.println("goodbye");

    }

    public Say(String s) {
        System.out.println("say " + s);

    }

}
