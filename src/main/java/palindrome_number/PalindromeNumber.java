package palindrome_number;

public class PalindromeNumber {

    public static boolean isNumberPalindrome(int number) { // 1221
        int workNumber = number;
        int reversed = 0;
        while (workNumber > 0) {
            int remain = workNumber % 10;
            reversed = reversed * 10 + remain;
            workNumber = workNumber / 10;
        }

        return reversed == number;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(1221));
        System.out.println(isNumberPalindrome(1221));
        System.out.println(isNumberPalindrome(101));
        System.out.println(isNumberPalindrome(2312));
        System.out.println(isNumberPalindrome(2121));
    }
}
