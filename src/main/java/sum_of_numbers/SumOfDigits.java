package sum_of_numbers;

import java.util.Arrays;

public class SumOfDigits {

    public static int calculateSumOfDigitsFunctional(String number) {
        return Arrays.stream(number.split("")).mapToInt(Integer::valueOf).sum();
    }

    public static int calculateSumOfDigits(String string) {
        int number = Integer.parseInt(string);
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        String number = "12345";
        System.out.println(calculateSumOfDigitsFunctional(number));
        System.out.println(calculateSumOfDigits(number));
    }
}
