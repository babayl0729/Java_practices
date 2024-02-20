package java_practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

/* 
Minimum of two numbers
*/

public class MinimumNums {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number: ");
        String num1 = reader.readLine();
        int num2 = Integer.parseInt(num1);
        
        System.out.println("Enter second number: ");
        String num3 = reader.readLine();
        int num4 = Integer.parseInt(num3);
        int minimum = Math.min(num2,num4);
        
        if(num2 == num4) {
            System.out.println("First: " + num2);
        } else {
            System.out.println("Minimum number: " + minimum);
        }
    }
}