import educ.dexequiel.patterns.command.Deposit;
import educ.dexequiel.patterns.command.Extraction;
import educ.dexequiel.patterns.command.IBankOperation;
import educ.dexequiel.patterns.prototype.IBankAccount;
import educ.dexequiel.patterns.prototype.SavingsAccountImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCommand {

    @Test
    public void testCommand() {
        IBankAccount account = new SavingsAccountImpl(1000d);

        List<IBankOperation> operations = new ArrayList<>();
        operations.add(new Deposit(account, 200d));
        operations.add(new Extraction(account, 100d));

        operations.forEach(x -> x.execute());
        Assert.assertEquals((Double) 1100d, account.getAmount());
    }
}
