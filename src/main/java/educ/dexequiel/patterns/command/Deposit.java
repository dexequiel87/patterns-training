package educ.dexequiel.patterns.command;

import educ.dexequiel.patterns.prototype.IBankAccount;
import educ.dexequiel.patterns.proxy.BankAccountServiceFactory;
import educ.dexequiel.patterns.proxy.IBankAccountService;

public class Deposit implements IBankOperation {

    IBankAccountService service = BankAccountServiceFactory.getInstance().getBankAccountService();
    private IBankAccount account;
    private Double amount;


    public Deposit(IBankAccount account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        service.deposit(account, amount);
    }
}
