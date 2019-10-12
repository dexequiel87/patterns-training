package educ.dexequiel.patterns.factory;

public class ConnectionPostgreSQL implements IConection {

    public void connect() {
        System.out.println("PostgreSQL connected");
    }

    public void disconnect() {
        System.out.println("PostgreSQL disconnected");
    }
}
