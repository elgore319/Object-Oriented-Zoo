import java.util.ArrayList;

public class Main 
{
    public static void main(String [] args)
    {
        ArrayList<Animal> zoo = new ArrayList<>();

            zoo.add(new Mammal("Cat"));
            zoo.add(new Fish("Oarfish"));
            zoo.add(new Bird("Owl"));
        

        for (Animal animal : zoo)
        {
            System.out.println("Animal: " + ((animal instanceof Mammal) ? ((Mammal) animal).getName() : (animal instanceof Fish) ? ((Fish) animal).getName() : (animal instanceof Bird) ? ((Bird) animal).getName() : "Unknown"));
            animal.makeSound();
            animal.move();

            if (animal instanceof Flyable)
            {
                ((Flyable) animal).fly();
            }

            if (animal instanceof Swimmable)
            {
                ((Swimmable) animal).swim();
            }
        }
        {
            System.out.println();
        }
            
    }
}
