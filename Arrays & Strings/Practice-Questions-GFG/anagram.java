import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Take user input
        System.out.print("Enter first string: ");
        String s1 = scanner.next().toLowerCase();
        
        System.out.print("Enter second string: ");
        String s2 = scanner.next().toLowerCase();
        scanner.close();

        // 2. Fast check: If lengths don't match, they aren't anagrams
        if (s1.length() != s2.length()) {
            System.out.println(" Result: The strings ARE NOT anagrams.");
            return; // Exit early
        }

        // 3. Count frequencies
        int[] charCount = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }

        // 4. Verify results
        for (int count : charCount) {
            if (count != 0) {
                System.out.println(" Result: The strings ARE NOT anagrams.");
                return; // Exit if mismatch found
            }
        }

        // 5. If everything balances out
        System.out.println(" Result: The strings ARE anagrams.");
    }
}

