package java_practices;
/* 
Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
"even single-digit number" - if the number is even and has one digit,
"odd single-digit number" - if the number is odd and has one digit,
"even two-digit number" - if the number is even and has two digits,
"odd two-digit number" - if the number is odd and has two digits,
"even three-digit number" - if the number is even and has three digits,
"odd three-digit number" - if the number is odd and has three digits.
If the entered number does not fall in the range 1 - 999, don't display anything.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Describing numbers
*/

public class OddEvenSingleTwoDigit {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);
        
        if(num1 > 0 && num1 < 10 && num1 % 2 == 0) {
            System.out.println("even single-digit number");
        }
        else if(num1 < 10 && num1 > 0 && num1 % 2 != 0) {
            System.out.println("odd single-digit number");
        }
        else if(num1 > 9 && num1 < 100 && num1 % 2 == 0) {
            System.out.println("even two-digit number");
        }
        else if(num1 < 100 && num1 > 9 && num1 % 2 != 0) {
            System.out.println("odd two-digit number");
        }
        else if(num1 > 99 && num1 < 1000 && num1 % 2 == 0) {
            System.out.println("even three-digit number");
        }
        else if(num1 < 1000 && num1 > 99 && num1 % 2 != 0) {
            System.out.println("odd three-digit number");
        } else {
            System.out.println("That's out of range...");
        }
    }
}