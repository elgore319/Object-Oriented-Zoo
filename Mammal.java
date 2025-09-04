public class Mammal extends Animal
{
    public String name;

    public Mammal(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Roar Roar");
    }

    @Override
    public void move()
    {
        System.out.println("The " + name + " moves by walking on all fours");
    }
}