package JavaFundamentals;
import java.util.*;

public class Volumeofcylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of cylinder: " + volume);
        sc.close();
    }
}
