// Class – Container for the application logic
public class UseCasePalindromeCheckerApp {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {

        // String Literal – Hardcoded input
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome using conditional statement
        boolean isPalindrome;

        if (word.equals(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        // Display output in required format
        System.out.println("Input text: " + word);
        System.out.println("It is a Palindrome ? : " + isPalindrome);
    }
}