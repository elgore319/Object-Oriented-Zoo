/**
 * Represents a fish in the zoo.
 */
package animals;

public class Fish extends Animal {
    /**
     * Constructs a fish with the given name.
     * @param name the name of the fish
     */
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + getName() + " blubs!");
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " swims in the water.");
    }
}
