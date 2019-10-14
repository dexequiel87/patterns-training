package educ.dexequiel.patterns.prototype;

import java.util.List;

public interface IBankAccount extends Cloneable {

    public IBankAccount clone();

    public Double getAmount();
    public void setAmount(Double amount);
    public List<String> getServices();
}
