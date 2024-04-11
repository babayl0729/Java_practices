package abstraction;

//you cannot create instance of an Abstract class.

//abstract is basically almost like a regular class except
// that it has abstract methods in it.
// and an abstract class can only be extended you cannot
//instanstiate an instance of an abstract class.
//it's only meant to be a parent of another class. 

//you cannot create instnces of an Abstract class.
//abstract classes are used for inherittance.

public abstract class Animal {
    int age;
    String gender;
    int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public abstract void move();
}
