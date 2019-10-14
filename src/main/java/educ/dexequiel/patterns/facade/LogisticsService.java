package educ.dexequiel.patterns.facade;

public interface LogisticsService {
    public double getPrice(Integer zipcodeFrom, Integer zipcodeTo, Double weight, Double declaredValue);
}
