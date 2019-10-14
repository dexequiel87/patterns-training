package educ.dexequiel.patterns.command;

import educ.dexequiel.patterns.prototype.IBankAccount;
import educ.dexequiel.patterns.proxy.BankAccountServiceFactory;
import educ.dexequiel.patterns.proxy.IBankAccountService;

public class Extraction implements IBankOperation {

    private final static IBankAccountService service = BankAccountServiceFactory.getInstance().getBankAccountService();
    private IBankAccount account;
    private Double amount;

    public Extraction(IBankAccount account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        service.extract(account, amount);
    }
}
