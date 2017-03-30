package reusingclasses;

/**
 * Created by lbuthman on 3/29/17.
 * creating non-default constructors with inheritance
 */
class Component1 {
    Component1(int i) {
        System.out.println("This is Component1 created with argument " + i);
    }
}

class Component2 {
    Component2(int i) {
        System.out.println("This is Component2 created with argument " + i);
    }
}

class Component3 {
    Component3(int i) {
        System.out.println("This is Component3 created with argument " + i);
    }
}

class Root {
    int internal_i = 101;
    Root() {
        System.out.println("Root");
        new Component1(internal_i);
        new Component2(internal_i);
        new Component3(internal_i);
    }

/*    Root(int i) {
        System.out.println("Root");
        new Component1(i);
        new Component2(i);
        new Component3(i);
    }*/
}

class Stem extends  Root {
    int internal_i = 11;
    Stem() {
        System.out.println("Stem");
        new Component1(internal_i);
        new Component2(internal_i);
        new Component3(internal_i);
    }

/*    Stem(int i) {
        System.out.println("Stem");
        new Component1(i);
        new Component2(i);
        new Component3(i);
    }*/
}

public class Ex10 {
    public static void main(String[] args) {
        new Stem();

    }

}
