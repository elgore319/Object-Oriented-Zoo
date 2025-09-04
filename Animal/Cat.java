
package Animal;
import Interfaces.Walkable;

public class Cat extends Animal implements Walkable
{
    private String name;
    private String species;
    
    public Cat(String name, String species) 
    {
        this.name = name;
        this.species = species;
    }
    
    public String getName() 
    {
        return name;
    }

    public String getSpecies() 
    {
        return species;
    }


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
