import educ.dexequiel.patterns.singleton.Singleton;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSingleton {

    @Test
    public void testSingleton() {
        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();
        assertEquals(i1.getId(), i2.getId());
    }
}
