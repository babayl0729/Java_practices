/*
 * Use the keyboard to enter a string and a number N greater than 0.
 * Use a while loop to display the string N times. Each value should be on a new line.
 */

/*
 * 
 * The program should read the text from the keyboard.
 * The program should display text on the screen.
 * Each value should be displayed on a new line.
 * The program should display the string N times.
 * The program must use a while loop.
 */

package java_practices.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
You can't have too much of a good thing
*/

public class NumberOfString {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a string: ");
        String string = reader.readLine();

        System.out.println("Enter how many times you want to repeat the string.");
        String num1 = reader.readLine();
        int num2 = Integer.parseInt(num1);
        
        while(num2 > 0) {
            num2--;
            if(num2+1 > 0) {
                System.out.println(string);
            }
        }
    }
}