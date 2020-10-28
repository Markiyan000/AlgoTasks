package fibonacci;

public class FibonacciSeries {

    private static void printFibonacciSeries(int length) {
        int prev = 0;
        int current = 1;
        System.out.print(prev + " " + current + " ");
        for(int i = 2; i < length; i++) {
            int next = prev + current;
            System.out.print(next + " ");
            prev = current;
            current = next;
        }
    }

    private static void printFibonacciSeriesWithTwoVariables(int length) {
        int prev = 0;
        int current = 1;
        System.out.print(prev + " " + current + " ");
        for(int i = 2; i < length; i++) {
            System.out.print((prev + current) + " ");
            current = prev + current;
            prev = current - prev;
        }
    }

    private static void printFibonacciSeriesRecursive(int prev, int current, int index, int length) {
        if (index >= length) return;
        int next = prev + current;
        System.out.print(next + " ");
        printFibonacciSeriesRecursive(current, next, ++index, length);
    }

    public static void main(String[] args) {
        printFibonacciSeries(10);
        System.out.println();
        printFibonacciSeriesWithTwoVariables(10);
        System.out.print("\n0 1 ");
        printFibonacciSeriesRecursive(0, 1, 2, 10);
    }
}
