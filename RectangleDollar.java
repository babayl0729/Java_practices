/*
 * Use the keyboard to enter two numbers m and n.
*  Using a for loop, display an n x m rectangle made of dollars.
 */

/*
 *  The program should read two numbers from the keyboard.
•	The program should display numbers on the screen.
•	The program should display a n x m rectangle made of eights.
•	The program must use a for loo
 */

package java_practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Drawing a rectangle
*/

public class RectangleDollar {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many times you want to repeat: ");
        String num1 = reader.readLine();
        int num2 = Integer.parseInt(num1);

        System.out.println("Enter number of dollars for the length: ");
        String num3 = reader.readLine();
        int num4 = Integer.parseInt(num3);
        
        for(int x = 1; x <= num2; x++) {
            for(int y = 1; y <= num4; y++) {
                System.out.print("$");
            }
            System.out.println();
        }

    }
}
