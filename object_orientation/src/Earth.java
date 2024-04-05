public class Earth {
    public static void main(String args[]) {
        //instance variable
        //it points to the actual object.
        //Human tom; // variable of type Human
        // new keyword is used when calling the constructor method
        // to create a new Object.
        // tom = new Human(); 
        // tom.age = 20;
        // tom.name = "tom andes";
        // tom.heightInInches = 73;
        // tom.eyeColor = "brown"; 
        // tom.speak();

        // Human joe = new Human();
        // joe.age = 30;
        // joe.name = "joe stans";
        // joe.heightInInches = 70;
        // joe.eyeColor = "red";
        // joe.speak();

        //other way to do the instances above is to add the values in the constructor
        // from Human.java.

        Human human1 = new Human("Joe Go", 20, 72, "brown");
        Human human2 = new Human("Lenny Ga", 34, 71, "black");
        Human human3 = new Human("Yag Bols", 21, 78, "red");

        human1.speak();
        human2.speak();
        human3.speak();
        
    }

}
