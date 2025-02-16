// 3. Power Calculation
// Write a program that takes two numbers as input: a base and an exponent,
// and prints the result of base raised to the exponent (without using loops or


import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}