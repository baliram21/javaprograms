package javaprograms.interfaces.example;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();

    // Default method provided by the interface
    default void defaultMethod() {
        System.out.println("Default method");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an anonymous implementation of MyFunctionalInterface using a lambda expression
        MyFunctionalInterface myInterface = () -> {
            System.out.println("Abstract method implementation");
        };

        // Calling abstract method
        myInterface.myMethod();

        // Calling default method
        myInterface.defaultMethod();

        // Using methods inherited from Object class
        // toString() method
        System.out.println("Object's toString(): " + myInterface.toString());

        // hashCode() method
        System.out.println("Object's hashCode(): " + myInterface.hashCode());

        // equals() method
        MyFunctionalInterface otherInterface = () -> {
            System.out.println("Another abstract method implementation");
        };
        System.out.println("Object's equals(): " + myInterface.equals(otherInterface));
    }

    //A functional interface in Java is an interface that contains exactly one abstract method.
    // It may contain one or more default methods or static methods,
    // but it must have only one abstract method. Functional interfaces are also known as SAM interfaces,
    // which stands for Single Abstract Method interfaces.

    //Functional interfaces are central to the concept of lambda expressions introduced in Java 8.
    // Lambda expressions allow you to express instances of single-method interfaces
    // (functional interfaces) more concisely.
    // They provide a way to pass behavior (a piece of code) to methods more succinctly
    // and in a more expressive way.

    //Here's the general definition of a functional interface:

   // It contains only one abstract method (SAM).
    //It can contain any number of default methods or static methods.
   // It can have its abstract method from the java.lang.Object class,
    // such as equals(), hashCode(), or toString() methods,
    // because they are not considered abstract methods for functional interface purposes.
    //Java 8 introduced the @FunctionalInterface annotation, which is optional but recommended.
    // It ensures that the interface has only one abstract method.
    // If an interface marked with @FunctionalInterface contains more than one abstract method,
    // the compiler will throw an error.
}
