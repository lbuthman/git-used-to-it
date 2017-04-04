package reusingclasses;

/**
 * Created by lbuthman on 4/3/17.
 */
class Puppy {
    final String name;

    public Puppy(String n) {
        name = n;
    }
}

public class Ex19 {
    public static void main(String[] args) {
        Puppy lab = new Puppy("Master P");
        System.out.println(lab.name);
        //lab.name = "not going to work";
    }
}
