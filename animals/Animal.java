/**
 * Abstract base class for all animals in the zoo.
 */
package animals;

public abstract class Animal {
    private String name;

    /**
     * Constructs an animal with the given name.
     * @param name the name of the animal
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the animal.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the animal.
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Makes the animal produce its sound.
     */
    public abstract void makeSound();

    /**
     * Makes the animal move.
     */
    public abstract void move();
}
