/*
 Create an array of 10 numbers.
Enter 10 numbers from the keyboard and write them to the array.
Display the elements of the array in reverse order. Display each value on a new line.

Requirements:
The program should create an array and initialize it with new int[10] value.
The program should read numbers for the array from the keyboard.
The program should display 10 values, each on a new line.
The array must be displayed in reverse order.
 */
package java_practices.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order
*/

public class IntReverse {
    public static void main(String[] args) throws Exception {
        //write your code here
        System.out.println("Enter 8 integers to reverse: ");
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int[] nums = new int[10]; 
        for(int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 9; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}