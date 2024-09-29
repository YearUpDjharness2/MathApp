package com.pluralsight;
/*
*

1. Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any
value
you want. Print the answer (i.e "The highest salary is …")

2. Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want.

3. 4.
Find and display the area of a circle whose radius is 7.25
Find and display the square root a variable after it is set to 5.0

*
5. 6. 7.
Find and display the distance between the points (5, 10) and (85, 50)
Find and display the absolute (positive) value of a variable after it is set
to -3.8 com.pluralsight
Find and display a random number between 0 and 1

*
* */

import java.util.Random;
public class MathApp {

    public static void main(String[] args) {
// Question 1:
        double bobSalary = 10000.24 ;
        double garySalary = 20000;
        double highestSalary = Math.max(bobSalary, garySalary);
        // Question Two
// Declaration and Initialization
        double carPrice = 45000.25;
        double truckPrice = 70000.50;
        double cheapestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The cheapestPrice is: " + cheapestPrice);
        // Question Three
// Declaration and Initialization
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the cirlce: " + area);
        // Question Four
// Declaration and Initialization
        double sqrtRoot = 5;
        double sqrt = Math.sqrt(sqrtRoot);
        // Question Five
        // Declaration and Initialization
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 -
                y1), 2));
        System.out.println("The distance between the points (5, 10) and (85, 50) is: "+ distance);

// Question Six
// Declaration and Initialization
        double value = -3.8;
        double absoluteValue = Math.abs(value);
        System.out.println("Absolute value of -3.8: " + absoluteValue);

// Question Seven
// Declaration and Initialization
        double randomNumber = new Random().nextDouble(0,1);
        System.out.println("The Random Number (between 0 - 1): " +
                randomNumber);

    }
}




