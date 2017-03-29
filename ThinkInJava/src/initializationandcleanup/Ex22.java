package initializationandcleanup;

/**
 * Created by lbuthman on 3/23/17.
 * use switch
 */
public class Ex22 {

    Paper paper;

    public Ex22(Paper p) {
        this.paper = p;
    }

    public void killForIt() {
        switch (paper) {
            case BENJAMIN:
                System.out.println("Nah, not worth.");
                break;
            case FIFTY:
                System.out.println("Hmm, half a benji? ...");
                break;
            case TWENTY:
                System.out.println("Stakes have never been more average.");
                break;
            case TEN:
                System.out.println("... I could buy ten dollar drinks!");
                break;
            case FIVE:
                System.out.println("What would Abraham do??");
                break;
            case ONE:
                System.out.println("YES~~ Singles are pure.");
                break;
            default:
                System.out.println("You're already dead.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Would you kill, would you kill, would you kill for them bills yo?");
        Ex22 a1 = new Ex22(Paper.BENJAMIN);
        a1.killForIt();

        System.out.println("Would you kill, would you kill, would you kill for them bills yo?");
        Ex22 a2 = new Ex22(Paper.FIFTY);
        a2.killForIt();

        System.out.println("Would you kill, would you kill, would you kill for them bills yo?");
        Ex22 a3 = new Ex22(Paper.TWENTY);
        a3.killForIt();

        System.out.println("Would you kill, would you kill, would you kill for them bills yo?");
        Ex22 a4 = new Ex22(Paper.TEN);
        a4.killForIt();

        System.out.println("Would you kill, would you kill, would you kill for them bills yo?");
        Ex22 a5 = new Ex22(Paper.FIVE);
        a5.killForIt();

        System.out.println("Would you kill, would you kill, would you kill for them bills yo?");
        Ex22 a6 = new Ex22(Paper.ONE);
        a6.killForIt();
    }
}

