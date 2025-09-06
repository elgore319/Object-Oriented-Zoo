package Animals;

import Interfaces.Movements;
import Interfaces.Swimmable;

public class Mammal extends Animal implements Swimmable, Movements
{
    private String name;

    public Mammal(String name)
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
        System.out.println("Meow meow says the " + name + ".");
    }

    @Override
    public void move()
    {
        System.out.println("The " + name + " walks around.");
    }

    @Override
    public void Swim()
    {
        System.out.println("The " + name + " swims.");
    }

    @Override
    public void Walk()
    {
        System.out.println("The " + name + " walked around.");
    }

    @Override
    public void Run()
    {
        System.out.println("The " + name + " ran around.");
    }

    @Override
    public void Jump()
    {
        System.out.println("The " + name + " jumps around.");
    }

    @Override
    public void Fly()
    {
        System.out.println("The " + name + " fies around.");
    }
}