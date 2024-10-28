public class Cat extends Animal implements Runnable{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eat fish");
    }

    @Override
    public void run() {
        System.out.println("Runs at 10 km/h");
    }
}
