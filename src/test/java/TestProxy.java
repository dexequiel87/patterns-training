import educ.dexequiel.patterns.prototype.IBankAccount;
import educ.dexequiel.patterns.prototype.SavingsAccountImpl;
import educ.dexequiel.patterns.proxy.BankAccountServiceFactory;
import educ.dexequiel.patterns.proxy.BankAccountServiceImpl;
import educ.dexequiel.patterns.proxy.IBankAccountService;
import org.junit.Assert;
import org.junit.Test;

public class TestProxy {

    @Test
    public void testProxy() {
        IBankAccount account = new SavingsAccountImpl(1000d);
        IBankAccountService service = BankAccountServiceFactory.getInstance().getBankAccountService();

        service.deposit(account, 200d);
        service.extract(account, 100d);
        Assert.assertEquals((Double) 1100d, service.getAmount(account));
    }
}
