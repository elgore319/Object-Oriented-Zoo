public class Primate extends Animal implements Walkable
{
    private String name;
    private String species;
    
    public Primate(String name, String species) 
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
        System.out.println("Ooh ooh aah aah");
    }

    @Override
    void eat() 
    {
        System.out.println("The primate is eating.");
    }

    @Override
    void move() 
    {
        System.out.println("The primate is swinging through the trees.");
    }

    @Override
    public void walk() 
    {
        System.out.println("The primate is walking.");
    }
}