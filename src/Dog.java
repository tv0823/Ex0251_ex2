public class Dog extends Animal implements Runnable{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Eat meet");
    }

    @Override
    public void run() {
        System.out.println("Runs at 15 km/h");
    }
}
