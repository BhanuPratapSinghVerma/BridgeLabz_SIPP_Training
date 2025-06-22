package JavaFundamentals;
import java.util.*;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        scanner.close();
    }

}
