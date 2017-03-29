package reusingclasses;

/**
 * Created by lbuthman on 3/28/17.
 * prove inheritance creates parent object first, etc
 */
class Home {
    int boy = 0;
    public Home() {
        this.boy++;
        System.out.println(boy + " homeboy made");
    }
}

class Ghetto extends Home {
    public Ghetto() {
        this.boy++;
        System.out.println(boy + " homeboy's made");
    }
}

class Gang extends Ghetto {
    public Gang() {
        this.boy++;
        System.out.println(boy + " homeboy's a gang");
    }
}

public class Ex4 extends Ghetto {
    public static void main(String[] args) {
        Gang g = new Gang();
    }
}
