package operators;

/**
 * Created by lbuthman on 3/15/17.
 */
class Window {

    char rating;
}

public class Ex3 {
    public static void main(String[] args) {

        //create a window and give it a rating
        Window w1 = new Window();
        w1.rating = 'C';

        //print assignments to standard output
        System.out.println("Window 1's rating " + w1.rating + " class.");


        //call method to fix the window
        fix(w1);
        System.out.println("Window 1's rating " + w1.rating + " class.");

    }

    static void fix(Window w) {
        w.rating = 'A';
    }

}
