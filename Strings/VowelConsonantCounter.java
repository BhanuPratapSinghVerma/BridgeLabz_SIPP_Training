import java.util.Scanner;

public class VowelConsonantCounter {
    
    // Method to check character type
    private static String getCharacterType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }
    
    // Method to count vowels and consonants
    private static int[] countCharacters(String text) {
        int vowels = 0, consonants = 0;
        
        for (int i = 0; i < text.length(); i++) {
            String type = getCharacterType(text.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        
        return new int[]{vowels, consonants};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to analyze: ");
        String input = scanner.nextLine();
        
        int[] counts = countCharacters(input);
        
        System.out.println("\nAnalysis Results:");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        
        scanner.close();
    }
}