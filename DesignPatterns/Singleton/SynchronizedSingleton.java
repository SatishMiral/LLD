package DesignPatterns.Singleton;

// Thread-safe but poor performance under high concurrency.
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    // Private Constructor
    private SynchronizedSingleton(){};

    public static synchronized SynchronizedSingleton getInstance(){
        if(instance == null){
            instance = new SynchronizedSingleton();
        }

        return instance;
    }
}
