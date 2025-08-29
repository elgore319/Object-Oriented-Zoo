import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Bird("BlueJay"));
        animals.add(new Fish("Goldfish"));
        animals.add(new Mammal("Tiger"));

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            animal.move();
            animal.makeSound();
            System.out.println();
        }
    }
}
