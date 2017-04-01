package reusingclasses;

/**
 * Created by lbuthman on 3/31/17.
 */
class Amphibian {


    public String swim() {
        return "la la la la *practices backstroke*";
    }

    public void move(Amphibian a) {
        System.out.println(a.swim());
    }
}

class Frog extends Amphibian {

    public static void main(String[] args) {
        Frog kermit = new Frog();
        kermit.move(kermit);
    }
}

public class Ex16 {
}
