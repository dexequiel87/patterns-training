import educ.dexequiel.patterns.strategy.HighRiskInvestmentStrategy;
import educ.dexequiel.patterns.strategy.InvestmentContext;
import educ.dexequiel.patterns.strategy.LowRiskInvestmentStrategy;
import org.junit.Assert;
import org.junit.Test;

public class TestStrategy {

    @Test
    public void testStrategy() {

        InvestmentContext lowRiskContext = new InvestmentContext(new LowRiskInvestmentStrategy());
        Assert.assertEquals("Buy 0.2 BTC", lowRiskContext.performDailyInvestment());

        InvestmentContext highRiskContext = new InvestmentContext(new HighRiskInvestmentStrategy());
        Assert.assertEquals("Buy 1 BTC", highRiskContext.performDailyInvestment());
    }
}
