package educ.dexequiel.patterns.strategy;

public class InvestmentContext {

    private InvestmentStrategy investmentStrategy;

    public InvestmentContext(InvestmentStrategy investmentStrategy) {
        this.investmentStrategy = investmentStrategy;
    }

    public String performDailyInvestment() {
        return investmentStrategy.performDailyInvestment();
    }
}
