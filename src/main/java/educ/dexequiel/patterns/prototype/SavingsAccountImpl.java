package educ.dexequiel.patterns.prototype;

public class SavingsAccountImpl implements IBankAccount {

    private Double amount;

    @Override
    public IBankAccount clone() {
        SavingsAccountImpl clone = (SavingsAccountImpl) clone();
        return clone;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public SavingsAccountImpl(Double amount) {
        this.amount = amount;
    }
}
