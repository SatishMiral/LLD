package DesignPatterns.Singleton;

// Not thread-safe
public class LazySingleton {
    private static LazySingleton instance;
    // Always keep Constructor Private (we need only one instance)
    private LazySingleton(){}

    public LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
