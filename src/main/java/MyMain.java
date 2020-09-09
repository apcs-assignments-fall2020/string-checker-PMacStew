import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().substring(i, i + 1).equals("a") || str.toLowerCase().substring(i, i + 1).equals("b") || str.toLowerCase().substring(i, i + 1).equals("c"))
                count++;
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("The") || str.substring(i, i + 3).equals("the"))
                return true;
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i)))
                return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String stringEnter = scan.next();
        System.out.println("Your String contains " + countABC(stringEnter) + " a's, b's, or c's.");
        System.out.print("Your String does");
        if (!containsThe(stringEnter))
            System.out.print(" not");
        System.out.println(" contain the word the.");
        System.out.print("Your String is");
        if (!isPalindrome(stringEnter))
            System.out.print(" not");
;        System.out.println(" a palindrome.");

        // YOUR CODE HERE
    }
}
