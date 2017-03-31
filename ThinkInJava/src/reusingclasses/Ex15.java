package reusingclasses;

/**
 * Created by lbuthman on 3/30/17.
 */

class See {

    private String windowView;

    public See(){} //required default constructor

    public See(String view) {
        this.windowView = view;
    }

    protected void iSee() {
        System.out.println("I can see " + windowView);
    }
}

class Person extends See {
    private String name;

    public Person(String name, String sees) {
        super(sees);
        this.name = name;

    }
}

public class Ex15 {
    public static void main(String[] args) {
        Person mary = new Person("mary", "a beach");
        mary.iSee();
    }
}
