package com.masai;
import java.util.Scanner;
public class ExceptionHandlingExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt(); 
            int result = 100 / input; 
            System.out.println("Result of 100 divided by " + input + " is: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } 
        
        scanner.close(); 
    }
}

