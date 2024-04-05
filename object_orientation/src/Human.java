public class Human {
    
    //attributes
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //constructor provides a way to construct objects.
    //constructor always have the same name with your class.
    //if constructor is not define it comes by default by all classes.
    // This will pass in the values to assign to Objects.
    public Human(String name, int age, int heightInInches, String eyeColor) {
        super();
        //this keyword is actually a variable in java it points 
        //to current object in Human.java class.
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }
    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }
    public void eat() {
        System.out.println("eating...");
    }
    public void walk() {
        System.out.println("walking...");
    }
    public void work() {
        System.out.println("working...");
    }

}
