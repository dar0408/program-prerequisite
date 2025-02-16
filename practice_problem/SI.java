// 1. Calculate Simple Interest
// Write a program to calculate simple interest using the formula:
// Simple Interest = (Principal * Rate * Time) / 100.
// Take Principal, Rate, and Time as inputs from the user.

import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The simple interest is " + simpleInterest);
    }
}