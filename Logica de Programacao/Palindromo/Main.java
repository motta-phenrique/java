package Palindromo;

public class Main {
    public static void main(String[] args) {
        PalindromeCheck checker = new PalindromeCheck();
        int number = 122554; // Example number
        System.out.println("Is the number " + number + " a palindrome? " + checker.isPalindrome(number));
    }
}
