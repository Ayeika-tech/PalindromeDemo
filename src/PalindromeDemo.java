import java.util.ArrayList;

/**
 * PalindromeDemo
 */
public class PalindromeDemo {

    public static void main(String[] args) {
    
        String sentence = "Stella won no Wallets";
        String word = "Hannah";
        String greeting = "Hello";
        ArrayList<String> list = new ArrayList<>();
        list.add(sentence);
        list.add(word);
        list.add(greeting);

        for (String string : list) {
            if (isPalindrome(string))
                System.out.println(string + " is a palindrome");
            else
                System.out.println(string + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String w) {
        // replace any spaces or uppercase chars
        w = w.replaceAll("\\s", "").toLowerCase();
        // setting up a base case
        if (w.length() == 0 || w.length() == 1)
            return true;
        // check if first and last char are the same
        if (w.charAt(0) == w.charAt(w.length() - 1))
            return isPalindrome(w.substring(1, w.length() - 1));
        // otherwise return false if first and last dont equal
        return false;
    }
}
