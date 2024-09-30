package Questao01;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        if (word.length() < 2) {
            return true;
        }

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        } else {
            return false;
        }

    }
}

