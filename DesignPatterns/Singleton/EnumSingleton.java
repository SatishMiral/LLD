package DesignPatterns.Singleton;
// enum constants are already public static final by default.
public enum EnumSingleton {
    instance;

    public void doSomething() {
        System.out.println("Doing something");
    }
}
