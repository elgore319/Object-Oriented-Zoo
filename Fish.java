public class Fish extends Animal implements Swimmable
{
    private String name;
    private String species;
    
    public Fish(String name, String species) 
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
    void makeSound() 
    {
        System.out.println("Blub");
    }

    @Override
    void eat() 
    {
        System.out.println("The fish is eating.");
    }

    @Override
    void move() 
    {
        System.out.println("The fish is swimming.");
    }

    @Override
    public void swim() 
    {
        System.out.println("The fish is swimming.");
    }
}