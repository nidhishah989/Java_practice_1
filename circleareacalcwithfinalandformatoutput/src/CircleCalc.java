
/**
 * programmer:NIDHI SHAH
 * Write an application that inputs the radius of a circle as an integer and displays the circle's
 * diameter, circumference and area using floating-point value, value for the PI is 3.14159. Show
 * the
 * output unformatted and formatted, with each group of information separated with 2 blank lines.
 */

import java.util.Scanner;  //import class

public class CircleCalc {
    public static void main(String[] args)
    {
        //declare a constant
        final double PI = 3.14159;
        
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter the radius of the circle and read the value
        System.out.print("\nThis program calculate the diameter,circumference and area of circle.");
        System.out.print("\nEnter the radius of the circle: ");
        int radius = input.nextInt();  //read the vlaue in variable radius
        
        // calculate diameter, circumferances and area of the circle of user's radius
        double diameter = radius * 2;            //store diameter value in variable diameter
        double circumference = 2 * PI * radius;  //store circumference value in variable circumference
        double area = PI * Math.pow(radius,2);   //store area value in variable area
        
        //dispaly the unformatted output 
        System.out.print("\n UNFORMATTED OUTPUT:\n");
        System.out.println("Diameter of circle:      " + diameter);
        System.out.println("Circumference of circle: " + circumference);
        System.out.println("area of circle:          " + area);
        
        //display formatted output with two 2digit after decimal point
        System.out.print("\n\n FORMATTED OUTPUT:\n");
        System.out.printf("Diameter:     %10.2f" , diameter);
        System.out.printf("\nCircumference: %10.2f" , circumference);
        System.out.printf("\narea:          %10.2f" , area);
    }
}
