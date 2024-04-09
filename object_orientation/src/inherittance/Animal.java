package inherittance;

public class Animal {

    //attributes
    String animalKind;
    String animalName;
    String animalGender;
    int animalAge;
    int animalWeight;

    public Animal(String animalKind, String animalName, String animalGender, int animalAge, int animalWeight) {
        super();
        this.animalKind = animalKind;
        this.animalName = animalName;
        this.animalGender = animalGender;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }
    public void animalistic() {
        System.out.println("The animal kind is: " + animalKind);
        System.out.println("The animal name is: " + animalName);
        System.out.println("The animal gender is: " + animalGender);
        System.out.println("The animal age is: " + animalAge);
        System.out.println("The animal weight is: " + animalWeight);
    }
    public void activity() {
        System.out.println("The " + animalKind + " is exercising...");
    } 
    public void eating() {
        System.out.println("The " + animalKind + " is eating...");
    }
    public void pooping() {
        System.out.println("The " + animalKind + " is pooping...");
    }
}