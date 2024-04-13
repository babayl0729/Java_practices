/*
Create an array of 10 strings.
Enter 8 strings from the keyboard and save them in the array.
Display the contents of the entire array (10 elements) on the screen in reverse order.
Each element on a new line.

Requirements:
•	The program should create an array and initialize it with new String[10] value.
•	The program should read 8 strings for the array from the keyboard.
•	The program should display 10 strings on the screen, each on a new line.
•	The program should display the array (10 elements) in reverse order.
 */

 package java_practices.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order
*/

public class StringReverseInOrder {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter 8 strings to reverse: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("Thank you! come again!");
    }
}