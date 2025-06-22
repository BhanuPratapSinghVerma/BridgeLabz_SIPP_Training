package ProgrammingElements;

 import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        double cm, totalInches, feet, inches;

        
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your height in centimeters: ");
        cm = input.nextDouble();

      
        totalInches = cm / 2.54;

        
        feet = (int)(totalInches / 12);
        inches = totalInches % 12;

        
        System.out.printf("Your height in cm is %.2f, in feet is %.0f, and inches is %.2f\n", cm, feet, inches);
        input.close();
    }
}
 
  

