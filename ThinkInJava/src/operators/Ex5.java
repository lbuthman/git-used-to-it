package operators;

/**
 * Created by lbuthman on 3/15/17.
 */

class Dog {

    String name;
    String says;
}

public class Ex5 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Spot";
        dog1.says = "Arff!";

        dog2.name = "Scruffy";
        dog2.says = "Ruff!";

        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);
    }

}
