import static org.junit.Assert.*;
import educ.dexequiel.patterns.prototype.IBankAccount;
import educ.dexequiel.patterns.prototype.SavingsAccountImpl;
import org.junit.Test;

public class TestPrototype {

    @Test
    public void testPrototype() {
        IBankAccount original = new SavingsAccountImpl(200d);
        IBankAccount clone = (SavingsAccountImpl) original.clone();

        assertEquals(original.getAmount(), clone.getAmount());
        assertFalse(original == clone);
    }
}
