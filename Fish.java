public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + getName() + " blubs!");
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " swims in the water.");
    }
}
