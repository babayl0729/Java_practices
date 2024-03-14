package java_practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Use the keyboard to enter three numbers, and then display the middle number. 
    In other words, not the largest and not the smallest. 
    If all the numbers are equal, display any one of them.
    Requirements:
•	The program should read the numbers from the keyboard.
•	The program must display a number on the screen.
•	The program should display the middle number of the three numbers.
•	If all the numbers are equal, display any one of them.
•	If two of the three numbers are equal, display either of the two.
 */

/* 
Somewhere in the middle
*/

public class MidNmbr {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int n2 = Integer.parseInt(n1);
        String n3 = reader.readLine();
        int n4 = Integer.parseInt(n3);
        String n5 = reader.readLine();
        int n6 = Integer.parseInt(n5);

        if((n2 >= n4 && n2 <= n6) || (n2 <= n4 && n2 >= n6)) {
            System.out.println(n2);
        }
        else if((n4 >= n2 && n4 <= n6) || (n4 <= n2 && n4 >= n6)){
            System.out.println(n4);
        }
        else {
            System.out.println(n6);
        }
    }
}
