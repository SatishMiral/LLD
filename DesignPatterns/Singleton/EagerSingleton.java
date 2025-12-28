package DesignPatterns.Singleton;

// Instance created at class loading time
// Simple, thread-safe by default
// But Instance created even if never used
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    // Always keep Constructor Private (we need only one instance)
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}