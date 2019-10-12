package educ.dexequiel.patterns.factory;

public class ConnectionMySQL implements IConection {

    public void connect() {
        System.out.println("MySQL connected");
    }

    public void disconnect() {
        System.out.println("MySQL disconnected");
    }
}
