package ProgrammingElements;

import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        double base, height;
        double areaSqCm, areaSqIn;

       
        Scanner input = new Scanner(System.in);

    
        System.out.print("Enter the base of the triangle (in cm): ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        height = input.nextDouble();

        areaSqCm = 0.5 * base * height;

        
        areaSqIn = areaSqCm / 6.4516;

        
        System.out.printf("The area of the triangle in sq cm is %.2f and in sq in is %.2f\n", areaSqCm, areaSqIn);
    }
    }


