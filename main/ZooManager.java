/**
 * Manages the zoo, loads animals, and provides a menu for user interaction.
 */
package main;

import animals.*;
import interfaces.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooManager {
    private ArrayList<Animal> animals = new ArrayList<>();

    /**
     * Loads sample animals into the zoo.
     */
    public void loadAnimals() {
        animals.add(new Bird("BlueJay"));
        animals.add(new Fish("Goldfish"));
        animals.add(new Mammal("Tiger"));
    }

    /**
     * Displays the main menu and handles user input.
     */
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nZoo Menu:");
            System.out.println("1. List All Animals");
            System.out.println("2. Make All Move");
            System.out.println("3. Make All Sound");
            System.out.println("4. Show Special Abilities");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        listAll();
                        break;
                    case 2:
                        makeAllMove();
                        break;
                    case 3:
                        makeAllSound();
                        break;
                    case 4:
                        showAbilities();
                        break;
                    case 5:
                        running = false;
                        System.out.println("Exiting Zoo Manager.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        scanner.close();
    }

    /**
     * Lists all animals in the zoo.
     */
    public void listAll() {
        for (Animal animal : animals) {
            System.out.println("- " + animal.getName() + " (" + animal.getClass().getSimpleName() + ")");
        }
    }

    /**
     * Makes all animals move.
     */
    public void makeAllMove() {
        for (Animal animal : animals) {
            animal.move();
        }
    }

    /**
     * Makes all animals make their sound.
     */
    public void makeAllSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    /**
     * Shows special abilities for animals that implement interfaces.
     */
    public void showAbilities() {
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Walkable) {
                ((Walkable) animal).walk();
            }
        }
    }
}
