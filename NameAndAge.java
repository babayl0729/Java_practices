package java_practices;

public class NameAndAge {
     public static void welcomeGreetings() {
        System.out.println("Hi Welcome to Rikers!");
    }
    public static void yourName(String string) {
        if(string == "joe") {
            System.out.println("cell 1");
        }
        else if(string == "sam") {
            System.out.println("cell 2");
        }
        else if(string == "jen") {
            System.out.println("cell 3");
        }
        else if(string == "ken") {
            System.out.println("cell 4");
        }
        else {
            System.out.println("The rest put them in cell 666");
        }
    }
}
