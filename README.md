I had used Copilot as the AI. I mainly used to check bugs in my code that I did not see. I also used it to teach me how to use certain aspects of the code. For example, I used it to understand how to make use of a try catch use properly. I had created an if statement, but it was not sufficient to the rubric that was assigned. However, I did not want AI to write my code for me, but to show me an example of how it worked so I could learn how to implement them in the future. The AI was helpful in getting me to understand how to fix bugs and reviewing certain codefunctions that I may have forgotten from the summer. Any issues that I ran into regarding the responses from AI came from not giving the AI proper prompts. The changes I made were mainly in the try/catch function. I had adjusted the zero based index so that instead of making it where the first input was zero, I had the input be one. 

The only bugs it would produce was when the code changes in one class messed up the other code in the other classes. All that was necessary was to recalibrate the code to match with the other systems. As much as I would like to use this code in a real world application, I do think there are ways that I could make it more efficient. I could have certainly put the name and species properties into the abstract class, since the subclasses had all of the same properties.

Prompt Example:how would the interactWithAnimal method work with a try/catch and exception handeling

AI output:
Here’s how you could structure an interactWithAnimal method with try/catch and exception handling for user input:

NumberFormatException handles non-integer input.
IndexOutOfBoundsException handles invalid indices.
The generic Exception catch handles any other unexpected errors.
This makes your method robust and user-friendly. Let me know if you want this added to your code! 

public void interactWithAnimal() {
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Enter the index of the animal to interact with: ");
        int index = Integer.parseInt(scanner.nextLine());
        Animal animal = animals.get(index); // animals is your ArrayList<Animal>
        animal.makeSound();
        animal.eat();
        animal.move();
        if (animal instanceof Swimmable) {
            ((Swimmable) animal).swim();
             }
        if (animal instanceof Walkable) {
            ((Walkable) animal).walk();
        }
    } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number.");
    } catch (IndexOutOfBoundsException e) {
        System.out.println("No animal at that index. Please try again.");
    } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
    }

    Some of the changes that I made were that I had adjusted the index so that the first input would be one and not zero (choice -= 1). I also got rid of the scanner object since it was already in my code.
}
