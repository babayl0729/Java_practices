public class Dog extends Animal{

    public Dog(String animalKind, String animalName, String animalGender, int animalAge, int animalWeight) {
        super(animalKind, animalName, animalGender, animalAge, animalWeight);
    }
    public void barking() {
        System.out.println("The " + animalKind + " is barking...");
    }
}
