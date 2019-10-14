package educ.dexequiel.patterns.proxy;

import educ.dexequiel.patterns.prototype.IBankAccount;

public class BankAccountServiceImpl implements IBankAccountService {

    protected BankAccountServiceImpl() {}

    @Override
    public void deposit(IBankAccount account, Double amount) {
        account.setAmount(account.getAmount() + amount);
    }

    @Override
    public void extract(IBankAccount account, Double amount) {
        account.setAmount(account.getAmount() - amount);
    }

    @Override
    public Double getAmount(IBankAccount account) {
        return account.getAmount();
    }
}
