package initializationandcleanup;

/**
 * Created by lbuthman on 3/20/17.
 */
public class Ex5 {



    public static void main(String[] args) {

        new Dog();
        new Dog(1);
        new Dog(1.1);

    }
}

class Dog {

    public Dog() {
        System.out.println("Arf arg ~ just a lil' pup");
    }

    public Dog(int i) {
        System.out.println("BowWow! ~ normal dog barks");
    }

    public Dog(double j) {
        System.out.println("Rough Rough Rough Rough ~ double the dog, double the bark");
    }
}
