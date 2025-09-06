package Main;

public class Main 
{
    public static void main(String [] args)
    {
       /*ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Mammal("Cat"));
        zoo.add(new Fish("Oarfish"));
        zoo.add(new Bird("Owl"));   
        
        for (Animal animal : zoo)
        {
            animal.getName();
            animal.makeSound();
            animal.move();
            System.out.println();
        }

        ((Mammal) zoo.get(0)).Run();
        ((Bird) zoo.get(2)).Jump();      */

        ZooManager manager = new ZooManager();
        
        manager.Menu();

    } 
}
