public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("squick");
    }

    @Override
    public void eat() {
        System.out.println("Eat seeds");
    }

    @Override
    public void fly() {
        System.out.println("Flying at 50 km/h");
    }
}
