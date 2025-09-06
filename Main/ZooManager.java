package Main;

import Animals.Animal;
import Animals.Bird;
import Animals.Fish;
import Animals.Mammal;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooManager {
	private ArrayList<Animal> zoo;

    // Constructor for ZooManager (AI Suggestion)
	public ZooManager() {
		zoo = new ArrayList<>();
		loadAnimals();
	}

	// Method to create and load animals into the collection (AI Suggestion)
	private void loadAnimals() {
		zoo.add(new Mammal("Horse"));
		zoo.add(new Mammal("Squirrel"));
		zoo.add(new Fish("Pufferfish"));
		zoo.add(new Bird("Seagull"));
	}

	// Getter for the zoo collection (AI Suggestion)
	public ArrayList<Animal> getZoo() {
		return zoo;
	}

    // Method to list all animals in the collection.
    public void DisplayAnimals()
    {
        for (Animal animals : zoo)
        {
            animals.getName();
        }
    }

    // Method to move all animals in the collection.
    public void MoveAnimals()
    {
        for (Animal animals : zoo)
        {
            animals.move();
        }
    }

    // Method to create the menu and take commands and execute other methods (AI Suggestion with some personal changes.)
    public void Menu()
    {
        Scanner scnr = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) 
        {
            System.out.println("\nZoo Manager Menu:");
            System.out.println("1. List All Animals");
            System.out.println("2. Make All Animals Move");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            if (scnr.hasNextInt()) 
            {
                choice = scnr.nextInt();
                scnr.nextLine(); // consume newline
            } 
            else 
            {
                System.out.println("Invalid input. Please enter a number.");
                scnr.nextLine();
                continue;
            }
            switch (choice) 
            {
                case 1:
                    System.out.println();
                    DisplayAnimals();
                    break;
                case 2:
                    System.out.println();
                    MoveAnimals();
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Exiting menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scnr.close();
    }
}
