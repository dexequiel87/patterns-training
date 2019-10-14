package educ.dexequiel.patterns.decorator;

import educ.dexequiel.patterns.prototype.IBankAccount;

import java.util.List;

public class AssuredAccount extends DecoratedAccount {

    public AssuredAccount(IBankAccount bankAccount) {
        super(bankAccount);
        super.addService("insurance");
    }
}
