package string_to_integer;

public class StringToInteger {

    public static int stringToInt(String string) {
        int number = 0;
        int multiply = 1;
        for(int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            number = number * multiply + (currentChar - '0');
            multiply = 10;
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println(stringToInt("1234"));
        System.out.println(stringToInt("5678"));
        System.out.println(stringToInt("1111"));
        System.out.println("5");
    }
}
