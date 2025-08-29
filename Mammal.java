public class Mammal extends Animal {
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
}
