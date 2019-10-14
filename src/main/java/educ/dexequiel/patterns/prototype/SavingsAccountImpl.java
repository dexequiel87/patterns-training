package educ.dexequiel.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccountImpl implements IBankAccount {

    private Double amount;
    private List<String> services;

    @Override
    public IBankAccount clone() {
        SavingsAccountImpl clone = null;
        try {
            clone = (SavingsAccountImpl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
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

    @Override
    public List<String> getServices() {
        if (this.services == null) {
            this.services = new ArrayList();
        }
        return this.services;
    }

    public SavingsAccountImpl(Double amount) {
        this.amount = amount;
    }
}
