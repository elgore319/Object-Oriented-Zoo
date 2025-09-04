public class Fish extends Animal implements Swimmable
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

    public String getName()
    {
        return name;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Blub Blub");
    }

    @Override
    public void move()
    {
        System.out.println("The " + name + " moves by swimming");
    }

    @Override
    public void swim()
    {
        System.out.println("The " + name + " swims.");
    }
}
