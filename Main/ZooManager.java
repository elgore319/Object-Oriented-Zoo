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

        scanner.close();
    } 
   
}