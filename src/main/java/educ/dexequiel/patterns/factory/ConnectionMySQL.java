package educ.dexequiel.patterns.factory;

public class ConectionMySQL implements IConection {

    public void connect() {
        System.out.println("MySQL connected");
    }

    public void disconnect() {
        System.out.println("MySQL disconnected");
    }
}
