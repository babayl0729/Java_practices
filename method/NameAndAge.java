package java_practices.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAndAge {
    //  public static void welcomeGreetings() {
    //     System.out.println("Hi Welcome to Rikers!");
    // }
    public static void yourName(String string) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        string = reader.readLine();
        System.out.println("Welcome to Rikers Island " + string);
    }
    public static int yourAge(int num1) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age: ");
        String r1 = reader.readLine();
        num1 = Integer.parseInt(r1);

        if(num1 >= 18) {
            System.out.println("You're " + num1 + " You're going to adult facility.");
        }
        else {
            System.out.println("You're " + num1 + " You're going to juvenile facility.");
        }
        return num1;
    }

}

