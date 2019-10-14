package educ.dexequiel.patterns.proxy;

import educ.dexequiel.patterns.prototype.IBankAccount;

public interface IBankAccountService {

    public void deposit(IBankAccount account, Double amount);

    public void extract(IBankAccount account, Double amount);

    public Double getAmount(IBankAccount account);
}
