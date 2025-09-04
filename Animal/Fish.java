/**
 * Class representing a Fish, which is a type of Animal and implements Walkable behavior.
 */
package Animal;

import Interfaces.Swimmable;

public class Fish extends Animal implements Swimmable
{
    /**
     * Fish properties.
     */
    private String name;
    private String species;
    
    /**
     * Constructor to initialize a Fish object.
     * @param name
     * @param species
     */
    public Fish(String name, String species) 
    {
        this.name = name;
        this.species = species;
    }
    
    /**
     * Get the name of the fish.
     * @return
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Get the species of the fish.
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
        System.out.println("Blub");
    }

    @Override
    public void eat() 
    {
        System.out.println("The fish is eating.");
    }

    @Override
    public void move() 
    {
        System.out.println("The fish is swimming.");
    }

    @Override
    public void swim() 
    {
        System.out.println("The fish is swimming.");
    }
}
