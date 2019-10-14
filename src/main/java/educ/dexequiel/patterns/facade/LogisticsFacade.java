package educ.dexequiel.patterns.facade;

public class LogisticsFacade {

    private static LogisticsFacade _instance = null;
    private LogisticsService andesmarService;
    private LogisticsService andreaniService;

    private LogisticsFacade() {

    }

    public static LogisticsFacade getInstance() {
        if (_instance == null) {
            _instance = new LogisticsFacade();
        }
        return _instance;
    }

    public void setAndesmarService(LogisticsService andesmarService) {
        this.andesmarService = andesmarService;
    }

    public void setAndreaniService(LogisticsService andreaniService) {
        this.andreaniService = andreaniService;
    }

    public Double getPrice(Integer zipcodeFrom, Integer zipcodeTo, Double weight, Double declaredValue) {
        return Math.min(
                andesmarService.getPrice(zipcodeFrom, zipcodeTo, weight, declaredValue),
                andreaniService.getPrice(zipcodeFrom, zipcodeTo, weight, declaredValue)
        );
    }
}
