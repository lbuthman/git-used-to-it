package controllingexecution;

/**
 * Created by lbuthman on 3/19/17.
 */
public class Ex10 {

    public static void vampire(int n) {

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n % 100 / 10;
        int digit4 = n % 10;
        int temp;
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4);

        for (int i=1; i<=4; i++) {
            for (int j=1; j<=4; j++) {

                switch (j) {
                    //digit 1 and digit 3 in the tens column
                    case 1:
                        if (digit1 !=0 && digit3 !=0) {
                            System.out.print(digit1 + "" + digit2 + " * " + digit3 + "" + digit4 + " = ");
                            System.out.println((digit1 * 10 + digit2) * (digit3 * 10 + digit4));
                        }
                        break;
                    //digit 2 and digit 3 in the tens column
                    case 2:
                        if (digit2 !=0 && digit3 !=0) {
                            System.out.print(digit2 + "" + digit1 + " * " + digit3 + "" + digit4 + " = ");
                            System.out.println((digit2 * 10 + digit1) * (digit3 * 10 + digit4));
                        }
                        break;
                    //digit 1 and digit 4 in the tens column
                    case 3:
                        if (digit1 !=0 && digit4 !=0) {
                            System.out.print(digit1 + "" + digit2 + " * " + digit4 + "" + digit3 + " = ");
                            System.out.println((digit1 * 10 + digit2) * (digit4 * 10 + digit3));
                        }
                        break;
                    //digit 2 and digit 4 in the tens column
                    case 4:
                        if (digit2 !=0 && digit4 !=0) {
                            System.out.print(digit2 + "" + digit1 + " * " + digit4 + "" + digit3 + " = ");
                            System.out.println((digit2 * 10 + digit1) * (digit4 * 10 + digit3));
                        }
                }
            }

            //swap digits
            temp = digit1;
            digit1 = digit2;
            digit2 = digit3;
            digit3 = digit4;
            digit4 = temp;
        }

    }

    public static void main(String[] args) {

        vampire(1234);
        vampire(1230);
        vampire(1203);
        vampire(1032);
        vampire(0231);
        vampire(1821);
    }
}
