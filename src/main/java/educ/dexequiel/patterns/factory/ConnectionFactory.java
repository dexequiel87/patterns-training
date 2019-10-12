package educ.dexequiel.patterns.factory;

import static educ.dexequiel.patterns.factory.ConnectionType.*;

public class ConnectionFactory {

    private static ConnectionFactory _instance = null;

    private ConnectionFactory() {

    }

    public static ConnectionFactory getInstance() {
        if (_instance == null) {
            _instance = new ConnectionFactory();
        }
        return _instance;
    }

    public IConection getConnection(ConnectionType dbType) {
        IConection connection = null;
        switch (dbType) {
            case MY_SQL:
                connection = new ConnectionMySQL();
                break;
            case POSTGRESQL:
                connection = new ConnectionPostgreSQL();
                break;
        }
        return connection;
    }
}
