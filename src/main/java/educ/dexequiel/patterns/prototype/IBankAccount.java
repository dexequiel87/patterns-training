package educ.dexequiel.patterns.prototype;

public interface IBankAccount extends Cloneable {

    public IBankAccount clone();

    public Double getAmount();
    public void setAmount(Double amount);
}
