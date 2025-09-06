package Animals;

public class Fish extends Animal 
{
    private String name;

    public Fish(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void getName()
    {
        System.out.println(name);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Blub blub says the " + name + ".");
    }

    @Override
    public void move()
    {
        System.out.println("The " + name + " swims.");
    }

}
