package abstraction;

public class Chicken extends Bird{

    public Chicken(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    //overriding basically means we're replacing a method
    // we're inheretting.
    //overriding the method defined in Bird.
    // public void fly() {
    //     System.out.println("not able to fly...");
    // }
}
