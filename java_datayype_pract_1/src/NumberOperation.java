/*
 * project: Assignment1A   , file name : NumberOperation.java
 * This program calculate sum, product, diffrences,quotient and modulus of two integer numbers. 
 */

/**
 * Programmer: NIDHI SHAH
 * Write a java application that asks the user to enter two integers, obtains them from the
 * user and displays their sum, products, differences and quotient (division) and Modulus(%)
 */

import java.util.Scanner; //import class

public class NumberOperation {
    public static void main(String[] args)
    {
        //create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter two integers and read those values.
        System.out.print("\nThis application will calculate summation,product,subtraction,\n ");
        System.out.print("division and modulus of two integer numbers.\n\n");
        System.out.print("Enter the first integer number:");
        int num1 = input.nextInt(); // read first integer number in variable num1
        System.out.print("Enter the second integer number:");
        int num2 = input.nextInt(); // read second integer number in variable num2
        
        //calculate process on two numbers
        int sum = num1 + num2;              // sum variable to store summation of two numbers.
        int product = num1 * num2;          // product variable to store product of two numbers.
        int differ = num1 - num2;           // differ variable to store differences(subtraction)of two numbers.
        int quotient = num1 / num2;         // quotient variable to store quotient(division) of two numbers.
        int modulus = num1 % num2;          // modulus variable to store modulus of two numbers.
        
        //dispaly result
        System.out.print("\n The result of mathemetical operations on these two integers:\n");
        System.out.println("\n Summation:   " + sum + "\n");
        System.out.println("product:     " + product + "\n");
        System.out.println("differences: " + differ +"\n");        
        System.out.println("quotient:    " + quotient + "\n");
        System.out.println("modulus:     " + modulus + "\n");
    }
    
}
