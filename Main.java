package DifferenceObjectsClasses;

public class Main {
    public static void main(String[] args) {
        // Create instances or objects of the Person class
        // person1 and person2 are objects of the Person class.
        
        Person person1 = new Person("Robert.");
        Person person2 = new Person("Bobby.");

        // Display information about the persons
        person1.sayHello();
        person2.sayHello();
    }
}
