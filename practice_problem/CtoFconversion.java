// 3. Celsius to Fahrenheit Conversion
// Write a program that takes the temperature in Celsius as input and converts
// it to Fahrenheit using the formula:
// Fahrenheit = (Celsius * 9/5) + 32.


import java.util.Scanner;
public class CtoFconversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }
}