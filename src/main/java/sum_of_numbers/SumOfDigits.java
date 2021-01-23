package sum_of_numbers;

import java.util.Arrays;

public class SumOfDigits {

    public static int calculateSumOfDigitsFunctional(String number) {
        return Arrays.stream(number.split("")).mapToInt(Integer::valueOf).sum();
    }

    public static void main(String[] args) {
        String number = "12345";
        System.out.println(calculateSumOfDigitsFunctional(number));
    }
}
