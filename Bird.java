public class Bird extends Animal implements Flyable, Walkable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + getName() + " chirps!");
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " flies in the sky.");
    }

    @Override
    public void fly() {
        System.out.println("The " + getName() + " is flying!");
    }

    @Override
    public void walk() {
        System.out.println("The " + getName() + " hops on the ground.");
    }
}
