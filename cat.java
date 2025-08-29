public class cat extends animal.java
{
    private String name;
    private int species;
    
    public cat(String name, int species) 
    {
        this.name = name;
        this.species = species;
    }
    
    
    @Override
    void makeSound() 
    {
        System.out.println("Meow");
    }

    @Override
    void eat() 
    {
        System.out.println("The cat is eating.");
    }

    @Override
    void move() 
    {
        System.out.println("The cat is prowling.");
    }
}