package abstraction;

public class Fish extends Animal{ 

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void swim() {
        System.out.println("swimming...");
    }

    public void move() {
        System.out.println("fish is swimming...");
        
    }
}
