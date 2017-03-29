package operators;

/**
 * Created by lbuthman on 3/15/17.
 */
class Velocity {

    double displacement; //distance in feet
    double time;         //time in minutes and seconds

    public double calculateVelocity(double d, double t) {
        return d/t;
    }
}

public class Ex4 {

    public static void main(String[] args) {

        Velocity v = new Velocity();
        v.displacement = 14.0;
        v.time = 3.33;

        System.out.println("The velocity for this object is " + v.calculateVelocity(v.displacement, v.time));
    }
}
