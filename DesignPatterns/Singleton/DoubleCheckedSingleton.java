package DesignPatterns.Singleton;

public class DoubleCheckedSingleton {
    // Volatile prevents partially constructed objects due to instruction reordering.
    private static volatile DoubleCheckedSingleton instance;
    // Private Constructor
    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){
        if(instance == null){ // 1st check
            synchronized(DoubleCheckedSingleton.class){
                if(instance == null){ // 2nd check
                    instance = new DoubleCheckedSingleton();
                }
            }
        }

        return instance;
    }
}
