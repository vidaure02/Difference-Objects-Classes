package DifferenceObjectsClasses;

public class Person {
    // A class is a blueprint for creating objects. It defines the properties and behaviors that the objects will have.
    private String name;

    // Constructor to initialize the object
    // It is used to set the initial state of the object.
    public Person(String name) {
        this.name = name;
    }

    // Methods define the behavior of the class. They are actions that an object of the class can perform.
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
