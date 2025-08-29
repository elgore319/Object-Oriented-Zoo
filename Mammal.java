public class Mammal extends Animal implements Walkable {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + getName() + " growls!");
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " runs on land.");
    }

    @Override
    public void walk() {
        System.out.println("The " + getName() + " walks on four legs.");
    }
}
