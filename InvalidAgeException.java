package com.masai;
import java.util.Scanner;
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  // Set the error message
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Check if the age is valid
            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Error: Age must be between 0 and 150.");
            }
            
            System.out.println("Your age is: " + age);
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());  // Print the custom exception message
        } 
        catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer for age.");
        } 
        
        scanner.close(); // Close the scanner
    }
}
