package Main;

/**
 * Main class to run the Zoo Management System.
 */
public class Main 
{
    public static void main(String[] args) 
    {
        /**
         * Initialize the Zoo Manager and add animals/interact with animals.
         */
        ZooManager zooManager = new ZooManager();
        zooManager.addAnimal();
        zooManager.runMenu();
        
    }
    
}