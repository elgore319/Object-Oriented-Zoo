public class Bird extends Animal implements Flyable
{
    public String name;

    public Bird(String name)
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
        System.out.println("Chirp Chirp");
    }

    @Override
    public void move()
    {
        System.out.println("The " + name + " moves by hopping around");
    }

    @Override
    public void fly()
    {
        System.out.println("The " + name + "flies.");
    }
}
