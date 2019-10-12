import educ.dexequiel.patterns.factory.ConnectionFactory;
import educ.dexequiel.patterns.factory.ConnectionPostgreSQL;
import educ.dexequiel.patterns.factory.ConnectionType;
import educ.dexequiel.patterns.factory.IConection;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestConnectionFactory {

    @Test
    public void testConnectionFactory() {
        ConnectionFactory factory = ConnectionFactory.getInstance();
        IConection postgresConnection = factory.getConnection(ConnectionType.POSTGRESQL);
        assertTrue(postgresConnection instanceof ConnectionPostgreSQL);
    }
}
