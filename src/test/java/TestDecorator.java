import educ.dexequiel.patterns.decorator.AssuredAccount;
import educ.dexequiel.patterns.decorator.InvestmentAccount;
import educ.dexequiel.patterns.prototype.IBankAccount;
import educ.dexequiel.patterns.prototype.SavingsAccountImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestDecorator {

    @Test
    public void testDecorator() {

        String[] services = new String[] { "insurance", "investment" };

        IBankAccount basicAccount = new SavingsAccountImpl(0d);
        IBankAccount assuredAccount = new AssuredAccount(basicAccount);
        IBankAccount investmentAssuredAccount = new InvestmentAccount(assuredAccount);

        Assert.assertArrayEquals(services, investmentAssuredAccount.getServices().toArray());
    }
}
