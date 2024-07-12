package DifferenceObjectsClasses;

public class Person {
    // Class variable
    private String name;

    // Constructor to initialize the object   
    public Person(String name) {
        this.name = name;
    }

    // Method to display a greeting message
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
