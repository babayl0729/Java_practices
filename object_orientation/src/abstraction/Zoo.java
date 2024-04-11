

package abstraction;

public class Zoo {
    public static void main(String[] args) {
        System.out.println("----------------sparrow1------------------");
        Sparrow sparrow1 = new Sparrow(1, "m", 4);
        sparrow1.fly();
        System.out.println("--------------------fish1------------------");
        Fish fish1 = new Fish(1, "f", 2);
        fish1.move();
        System.out.println("---------------------moveAnimal fish1---------------");
        moveAnimal(fish1);
        System.out.println("-----------------------moveAnimal--------------------");
        moveAnimal(sparrow1);
        System.out.println("------------------------Flying------------------------");
        Flyable flyingBird1 = new Sparrow(1, "m", 4);
        flyingBird1.fly();
      
    }
    //Polymorphism allows your program more dynamic
    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
