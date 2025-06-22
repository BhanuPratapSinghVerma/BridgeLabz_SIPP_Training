package ProgrammingElements;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double number1, number2;
        double addition, subtraction, multiplication, division;

      
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

       
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;

        
        if (number2 != 0) {
            division = number1 / number2;
            System.out.printf(
                "The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                number1, number2, addition, subtraction, multiplication, division);
        } else {
            System.out.printf(
                "The addition, subtraction, and multiplication value of 2 numbers %.2f and %.2f is %.2f, %.2f, and %.2f\n",
                number1, number2, addition, subtraction, multiplication);
            System.out.println("Division not possible as the second number is 0.");
            }
        }
    }


