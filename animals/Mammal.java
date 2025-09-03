/**
 * Represents a mammal in the zoo.
 */
package animals;

import interfaces.Walkable;

public class Mammal extends Animal implements Walkable {
    /**
     * Constructs a mammal with the given name.
     * @param name the name of the mammal
     */
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + getName() + " growls!");
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " runs on land.");
    }

    @Override
    public void walk() {
        System.out.println("The " + getName() + " walks on four legs.");
    }
}
