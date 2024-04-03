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
    public static int yourGang(int num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number for your gang affiliation: ");
        System.out.println("1. yeppee\n" + "2. yolo\n" + "3. wannabes\n" + "4. swifty\n" 
        + "5. none");
        String gang = reader.readLine();
        num = Integer.parseInt(gang);
        
        if(num == 1) {
            System.out.println("yeepees belongs to sector-1.");
        }
        else if(num == 2) {
            System.out.println("yolos belongs to sector-2.");
        }
        else if(num == 3) {
            System.out.println("wannabes belongs to sector-3.");
        }
        else if(num == 4) {
            System.out.println("swifties belongs to sector-4.");
        }
        else {
            System.out.println("nones belongs to the general sector.");
        }
        return num;
    }
    public static int yourAge(int num1) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your age: ");
        String r1 = reader.readLine();
        num1 = Integer.parseInt(r1);

        if(num1 >= 18) {
            System.out.println("You're " + num1 + "yo You're going to adult facility.");
        }
        else if(num1 >= 12) {
            System.out.println("You're " + num1 + "yo You're going to juvenile facility.");
        }
        else {
            System.out.println("You're " + num1 + "yo You're going back to your parents.");
        }
        return num1;
    }

}

