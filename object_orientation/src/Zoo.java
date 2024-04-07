public class Zoo {

    public static void main(String args[]) {
        Animal animalistic1 = new Animal("lion", "zimba", "male", 3, 200);
        animalistic1.animalistic();
        animalistic1.activity();
        animalistic1.eating();
        animalistic1.pooping();
        System.out.println("\n");
        Dog doggie = new Dog("dog", "pitty", "F", 3, 100);
        doggie.animalistic();
        doggie.barking();
        doggie.eating();
    }
}
