/**
 * Class representing a Cat, which is a type of Animal and implements Walkable behavior.
 */
package Animal;
import Interfaces.Walkable;

 
public class Cat extends Animal implements Walkable
{
    /**
     * Cat properties.
     */
    private String name;
    private String species;
    
    /**
     * Constructor to initialize a Cat object.
     * @param name
     * @param species
     */
    public Cat(String name, String species) 
    {
        this.name = name;
        this.species = species;
    }
    
    /**
     * Get the name of the cat.
     * @return
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Get the species of the cat.
     * @return
     */
    public String getSpecies() 
    {
        return species;
    }

/**
 * Methods that all animals must implement.
 */
    @Override
    public void makeSound() 
    {
        System.out.println("Meow");
    }

    @Override
    public void eat() 
    {
        System.out.println("The cat is eating.");
    }

    @Override
    public void move() 
    {
        System.out.println("The cat is prowling.");
    }

    @Override
    public void walk() 
    {
        System.out.println("The cat is walking.");
    }
}
