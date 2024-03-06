/*
 * Use the keyboard to enter three integers. 
 * Display the number of positive numbers in the original set.
 * The program should display the number of positive numbers in the original set.
 * If there are no positive numbers, the program should display "0".
 * Note that 0 is not a positive or negative number.
 */
package java_practices.ifstatements;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class positiveNums {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();
        int num4 = Integer.parseInt(num1);
        int num5 = Integer.parseInt(num2);
        int num6 = Integer.parseInt(num3);
        int count = 0;
        
        if(num4>0) {
            count++;
        }
        if(num5>0){ 
            count++;
            
        }
        if (num6>0) {
            count++;
            
        }
            System.out.println(count);
    }
}