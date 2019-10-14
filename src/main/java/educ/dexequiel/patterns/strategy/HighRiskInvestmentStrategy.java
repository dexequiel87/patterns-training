package educ.dexequiel.patterns.strategy;

public class HighRiskInvestmentStrategy implements InvestmentStrategy {
    @Override
    public String performDailyInvestment() {
        return "Buy 1 BTC";
    }
}
