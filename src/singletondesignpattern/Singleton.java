package singletondesignpattern;

public class Singleton {

//    singletone design pattern examble in java

//    The Singleton design pattern is a design pattern that ensures that a class has only one instance, while providing a global access point to this instance. Here's an example of a singleton class in Java:
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
//    in this example, the Singleton class has a private constructor, which ensures that no other class can instantiate it. The getInstance() method is used to get the single instance of the class. The first time the method is called, a new instance of the class is created and stored in the instance variable. Any subsequent calls to the method will return the same instance.
}
