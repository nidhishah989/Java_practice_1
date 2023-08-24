/*
 * Project: Assignment1B   file name: MathFunction.java
 * This program ask user three integer numbers and display the summation, product, average of those three numbers.
 * This program also find and dispaly the smallest and highest number from those three numbers.
 */

/**
 * Programmer: NIDHI SHAH
 * Course: Write an application that inputs three integers from the user and displays the
 * sum, average, products, and smallest and largest of the numbers. The calculation of
 * the average in this exercise should result in an integer representation of the average.
 */

import java.util.Scanner;   //import class

public class MathFunction {
    public static void main(String[] args)
    {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter three integer values and read those values.
        System.out.print("\nTHIS APPLICATION CALCULATE SUM,AVERAGE,PRODUCT AND SMALLEST AND HIGHEST VALUE OF NUMBERS: \n");
        System.out.print("Enter three integer numbers: \n");
        System.out.print("number 1: ");
        int num1 = input.nextInt();        //read first integer number
        System.out.print("number2: ");
        int num2 = input.nextInt();        //read second integer number
        System.out.print("number3: ");
        int num3 = input.nextInt();        //read third integer number
        
        //calculate sum, product, and average of those three integer numbers
        int sum = num1 + num2 + num3;           //sum variable to store sumation of three integer numbers
        int product = num1 * num2 * num3;       //product variable to store product of three integer numbers
        int average = sum/3;                    //average variable to store the integer average value of three numbers
        
        // find smallest and largest pf the numbers using math.max and math.min methods
        //largest value finding.
        int largest1 = Math.max(num1,num2);                    //first find highest value from num1 and num2
        int largestfinal = Math.max(largest1,num3);            // find the final highest using math.max method with first arg (highest of num1,num2) and second arg(num3)and store in largestfinal var.
       
        //smallest value finding. 
        int smallest1 = Math.min(num1,num2);                   //first find smallest value from num1 and num2
        int smallestfinal = Math.min(smallest1,num3);          // find the final smallest using math.min method with first arg (smallest of num1,num2) and second arg(num3)and store in smallestfinal var.
        
        //dispaly output
        System.out.println("result for numbers:\t" + num1 +"\t"+ num2 + "\t"+num3 +"\n");
        System.out.println("Sum:             " + sum + "\n");
        System.out.println("product:         " + product + "\n");
        System.out.println("average:         " + average + "\n");
        System.out.println("Smallest number: " + smallestfinal + "\n");
        System.out.println("largest number:  " + largestfinal + "\n");  
    }
}
