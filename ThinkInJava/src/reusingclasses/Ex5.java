package reusingclasses;

/**
 * Created by lbuthman on 3/28/17.
 */
class A {
    public A() {
        System.out.println("Hi! It's me. A");
    }
}

class B {
    public B() {
        System.out.println("Sup, B here.");
    }
}

class C extends A {
   B b = new B();
}

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Roll call.");
        C c = new C();
    }
}
