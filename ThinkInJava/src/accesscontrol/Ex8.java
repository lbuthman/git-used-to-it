package accesscontrol;

/**
 * Created by lbuthman on 3/26/17.
 * Manage a ConnectionManager class that is limited to 3 objects and creates objects via static method
 */
class ConnectionManager {

    private static int numOfConnections = 0;
    final static private int MAX_CONNECTIONS = 3;

    private ConnectionManager() {
        //increment count when made
        numOfConnections++;
    }

    public static ConnectionManager makeConnection() {

        if (numOfConnections < MAX_CONNECTIONS) {
            return new ConnectionManager();

        } else {
            return null;
        }
    }
}
//test usage of Connection Manager
public class Ex8 {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            ConnectionManager cm = ConnectionManager.makeConnection();

            if (cm != null) {
                System.out.println("connection " + (i + 1) + " was SUCCESSFUL!");
            } else {
                System.out.println("connection " + (i + 1) + " was unsuccessful");
            }
        }
    }
}
