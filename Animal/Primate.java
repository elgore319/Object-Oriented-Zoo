/**
 * Class representing a Primate, which is a type of Animal that can walk.
 */
package Animal;

import Interfaces.Walkable;

public class Primate extends Animal implements Walkable
{
    /**
     * Primate properties.
     */
    private String name;
    private String species;
    
    /**
     * Constructor to initialize a Primate object.
     * @param name
     * @param species
     */
    public Primate(String name, String species) 
    {
        this.name = name;
        this.species = species;
    }
    
    /**
     * Get the name of the primate.
     * @return
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Get the species of the primate.
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
        System.out.println("Ooh ooh aah aah");
    }

    @Override
    public void eat() 
    {
        System.out.println("The primate is eating.");
    }

    @Override
    public void move() 
    {
        System.out.println("The primate is swinging through the trees.");
    }

    @Override
    public void walk() 
    {
        System.out.println("The primate is walking.");
    }
}
