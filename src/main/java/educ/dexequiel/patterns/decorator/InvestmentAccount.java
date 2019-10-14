package educ.dexequiel.patterns.decorator;

import educ.dexequiel.patterns.prototype.IBankAccount;

public class InvestmentAccount extends DecoratedAccount {

    public InvestmentAccount(IBankAccount decoratedAccount) {
        super(decoratedAccount);
        super.addService("investment");
    }
}
