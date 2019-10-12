package educ.dexequiel.patterns;

public class Singleton {

    private static Singleton _instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (_instance == null) {
            _instance = new  Singleton();
        }
        return _instance;
    }

    public void init() {
        System.out.println("Singleton initialized.");
    }

    public void terminate() {
        System.out.println("Singleton terminated.");
    }
}
