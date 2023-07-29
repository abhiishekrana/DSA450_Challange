package oops;
//Multiple inheritance solution
// Java Program to Illustrate Unsupportance of
// Multiple Inheritance
// Diamond Problem Similar Scenario

// Importing input output classes
import java.io.*;

// Class 1
// A Grand parent class in diamond
class GrandParent {

void fun() {

	// Print statement to be executed when this method is called
	System.out.println("Grandparent");
}
}

// Class 2
// First Parent class
class Parent1 extends GrandParent {
void fun() {

	// Print statement to be executed when this method is called
	System.out.println("Parent1");
}
}

// Class 3
// Second Parent Class
class Parent2 extends GrandParent {
void fun() {

	// Print statement to be executed when this method is called
	System.out.println("Parent2");
}
}

// Class 4
// Inheriting from multiple classes
class Test extends Parent1, Parent2 {

// Main driver method
public static void main(String args[]) {

	// Creating object of this class i main() method
	Test t = new Test();

	// Now calling fun() method from its parent classes
	// which will throw compilation error
	t.fun();
}
}



------------------------Solution by Interface------------
// Example of an interface
interface Animal {
    // Method signatures
    void makeSound();
    void eat();
}

// Implementing the Animal interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}

// Implementing the Animal interface in another class
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
