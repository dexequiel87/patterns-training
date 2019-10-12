package educ.dexequiel.patterns.singleton;

public class Singleton {

    private static Singleton _instance;
    private long id = (long) (Math.random() * 1000);

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

    public long getId() {
        return this.id;
    }
}
