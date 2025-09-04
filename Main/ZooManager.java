/**
 * ZooManager class to manage animals in the zoo.
 */

package Main;

import Animal.*;
import Interfaces.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooManager 
{
    /**
     * List to store animals in the zoo and a scanner for user input.
     */
    private ArrayList<Animal> animals;
    private Scanner scanner;

    /**
     * Constructor to initialize the animal list and scanner.
     */
    public ZooManager() 
    {
        animals = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    /**
     * Method to add animals to the zoo.
     */
    public void addAnimal()
    {
        animals.add(new Cat("Simba","Panthera leo"));
        animals.add(new Fish("Sharkie","Carcharodon carcharias"));
        animals.add(new Primate("George","Pan troglodytes"));
    }
    
    public void runMenu()
    {
        int choice = 0;
        do
        {
            System.out.println();
            System.out.println("Zoo Manager Menu:");
            System.out.println("1. List Animals");
            System.out.println("2. Interact with an Animal");
            System.out.println("3. Make All Animals Sound");
            System.out.println("4. Make All Animals Move");
            System.out.println("5. Make All Animals Eat");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            
            
            try
            {
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                continue;
            }
            
            switch (choice)
            {
                case 1:
                    animalList();
                    break;
                case 2:
                    interactWithAnimal();
                    break;
                case 3:
                    makeAllSound();
                    break;
                case 4:
                    makeAllMove();
                    break;
                case 5:
                    makeAllEat();
                    break;
                case 6:
                    System.out.println("Exiting Zoo Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 6);
        scanner.close();
    }
    /**
     * Method to interact with an animal based on user choice.
     */
    public void interactWithAnimal() 
    {
        try
        {
        System.out.print("Select an animal by number: ");
        int choice = Integer.parseInt(scanner.nextLine());
        choice -= 1; // Adjust for 0-based index
        Animal selectedAnimal = animals.get(choice);
        selectedAnimal.makeSound();
        selectedAnimal.eat();
        selectedAnimal.move();
        
        if (selectedAnimal instanceof Swimmable) 
        {
            ((Swimmable) selectedAnimal).swim();
        }
        if (selectedAnimal instanceof Walkable) 
        {
            ((Walkable) selectedAnimal).walk();
        }
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        catch (IndexOutOfBoundsException e) 
        {
            System.out.println("Invalid choice. Please select a valid animal number.");
        }
        catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
}
        
        public void animalList()
        {
            System.out.println("Animals in the Zoo:");
            for (int i = 0; i < animals.size(); i++) 
            {
                Animal animal = animals.get(i);
                System.out.println((i + 1) + ". " + animal.getClass().getSimpleName());
            }
        }
        public void makeAllSound() 
        {
            for (Animal animal : animals) 
            {
            animal.makeSound();
            }
        }

        public void makeAllMove() 
        {
         for (Animal animal : animals) 
            {
             animal.move();
            }
        }

        public void makeAllEat() 
        {
            for (Animal animal : animals) 
            {
             animal.eat();
            }
     
        }
    

}