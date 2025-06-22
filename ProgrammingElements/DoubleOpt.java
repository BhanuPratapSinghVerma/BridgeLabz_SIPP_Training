package ProgrammingElements;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

      
        double a, b, c;

        
        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        System.out.print("Enter value of c: ");
        c = input.nextDouble();

       
        double result1 = a + b * c;   
        double result2 = a * b + c;    
        double result3 = c + a / b;   
        double result4 = a % b + c;    

        
        System.out.println("\nThe results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
        input.close();
    }
}

