import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Cat("Simba","Panthera leo"));
        zoo.add(new Fish("Sharkie","Carcharodon carcharias"));
        zoo.add(new Primate("George","Pan troglodytes"));
        for (Animal animal : zoo) 
        {
            animal.makeSound();
            animal.eat();
            animal.move();
            if (animal instanceof Swimmable)
            {
                ((Swimmable) animal).swim();
            }
            if (animal instanceof Walkable)
            {
                ((Walkable) animal).walk();
            }
        }

        
    }
}