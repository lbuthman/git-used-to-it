package operators;

/**
 * Created by lbuthman on 3/15/17.
 */
public class Ex6 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2;

        dog1.name = "Jick";
        dog1.says = "Woof Woof!";

        dog2 = dog1;

        System.out.println(dog1 == dog2); //true
        System.out.println(dog1.equals(dog2)); //true
    }
}
