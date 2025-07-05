import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();
        
        int count = countUgandaOccurrences(description);
        System.out.println("The word 'Uganda' appears " + count + " times.");
    }
    
    public static int countUgandaOccurrences(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        
        
        String lowerText = text.toLowerCase();
        String searchTerm = "uganda";
        
        int count = 0;
        int index = 0;
        
        while ((index = lowerText.indexOf(searchTerm, index)) != -1) {
            count++;
            index += searchTerm.length();
        }
        
        return count;
    }
}
