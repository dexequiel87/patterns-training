package educ.dexequiel.patterns.proxy;

public class BankAccountServiceFactory {

    private static BankAccountServiceFactory _instance;

    private BankAccountServiceFactory() {}

    public static BankAccountServiceFactory getInstance() {
        if (_instance == null) {
            _instance = new BankAccountServiceFactory();
        }
        return _instance;
    }
    
    public IBankAccountService getBankAccountService() {
        return new BankAccountServiceProxy(new BankAccountServiceImpl());
    }
}
