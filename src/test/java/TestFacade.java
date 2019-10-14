import educ.dexequiel.patterns.facade.LogisticsService;
import educ.dexequiel.patterns.facade.LogisticsFacade;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestFacade {

    @Test
    public void testFacade() {

        // Initialize parameters
        Integer zipcodeFrom = 5500;
        Integer zipcodeTo = 1001;
        Double weight = 20d;
        Double declaredValue = 1000.0;
        Double expectedResult = 200d;
        Double andreaniPricing = 300d;

        // Initialize facade
        LogisticsFacade facade = LogisticsFacade.getInstance();

        // Mock services
        LogisticsService andesmarService = Mockito.mock(LogisticsService.class);
        facade.setAndesmarService(andesmarService);
        LogisticsService andreaniService = Mockito.mock(LogisticsService.class);
        facade.setAndreaniService(andreaniService);

        Mockito.when(andesmarService.getPrice(zipcodeFrom, zipcodeTo, weight, declaredValue)).thenReturn(expectedResult);
        Mockito.when(andreaniService.getPrice(zipcodeFrom, zipcodeTo, weight, declaredValue)).thenReturn(andreaniPricing);

        Assert.assertEquals(expectedResult, facade.getPrice(zipcodeFrom, zipcodeTo, weight, declaredValue));

    }
}
