package educ.dexequiel.patterns.factory;

public enum ConnectionType {

    MY_SQL("MY_SQL"),
    POSTGRESQL("POSTGRESQL");

    private String id;

    private ConnectionType(String  id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
