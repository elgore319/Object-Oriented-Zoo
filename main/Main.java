/**
 * Entry point for the Object-Oriented Zoo application.
 */
package main;

public class Main {
    /**
     * Main method to start the ZooManager.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ZooManager manager = new ZooManager();
        manager.loadAnimals();
        manager.displayMenu();
    }
}
