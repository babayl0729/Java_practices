/*
*   The program should not read text from the keyboard.
*	The program should display text on the screen.
*	The program should display a 10x10 multiplication table.
*	The program must use any kind of loop: for, while, or do-while.
 */

package java_practices.loops;

/* 
Multiplication table
*/

public class TenByTenMultiplicationTable {
    public static void main(String[] args) {
        //write your code here
        System.out.println("This is a Muliplication Table:");
        for(int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++) {
                System.out.print(" " + x*y);
            }
            System.out.println();
        }

    }
}
