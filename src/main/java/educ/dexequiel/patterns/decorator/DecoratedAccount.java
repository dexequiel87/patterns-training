package educ.dexequiel.patterns.decorator;

import educ.dexequiel.patterns.prototype.IBankAccount;

import java.util.List;

public abstract class DecoratedAccount implements IBankAccount {

    protected IBankAccount decoratedAccount;

    public DecoratedAccount(IBankAccount decoratedAccount) {
        this.decoratedAccount = decoratedAccount;
    }

    public void addService(String service) {
        decoratedAccount.getServices().add(service);
    }

    @Override
    public IBankAccount clone() {
        return decoratedAccount.clone();
    }

    @Override
    public Double getAmount() {
        return decoratedAccount.getAmount();
    }

    @Override
    public void setAmount(Double amount) {
        decoratedAccount.setAmount(amount);
    }

    @Override
    public List<String> getServices() {
        return decoratedAccount.getServices();
    }
}
