package abstraction;

// a class can only extends one  other class
public class Bird extends Animal{

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    // public void fly() {
    //     System.out.println("Flying...");
    // }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }
}
