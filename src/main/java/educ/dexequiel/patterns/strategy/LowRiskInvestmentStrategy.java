package educ.dexequiel.patterns.strategy;

public class LowRiskInvestmentStrategy implements InvestmentStrategy {
    @Override
    public String performDailyInvestment() {
        return "Buy 0.2 BTC";
    }
}
