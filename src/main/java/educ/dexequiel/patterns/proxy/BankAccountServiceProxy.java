package educ.dexequiel.patterns.proxy;

import educ.dexequiel.patterns.prototype.IBankAccount;

import java.util.logging.Logger;

public class BankAccountServiceProxy implements IBankAccountService {

    private final static Logger LOGGER = Logger.getLogger(BankAccountServiceProxy.class.getName());
    private IBankAccountService accountService;

    protected BankAccountServiceProxy() {}

    public BankAccountServiceProxy(IBankAccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void deposit(IBankAccount account, Double amount) {
        LOGGER.info("Depositing $" + amount + " into account");
        this.accountService.deposit(account, amount);
        LOGGER.info("Deposit completed");
    }

    @Override
    public void extract(IBankAccount account, Double amount) {
        LOGGER.info("Extracting $" + amount + " from account");
        this.accountService.extract(account, amount);
        LOGGER.info("Extraction completed");
    }

    @Override
    public Double getAmount(IBankAccount account) {
        LOGGER.info("Getting current amount");
        return this.accountService.getAmount(account);
    }
}
