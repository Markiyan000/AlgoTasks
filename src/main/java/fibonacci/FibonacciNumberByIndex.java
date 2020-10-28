package fibonacci;

public class FibonacciNumberByIndex {

    // 0 -> 1 -> 1 -> 2 -> 3 -> 5

    private static int findFibonacciNumberByIndex(int index) {
        int prev = 0;
        int current = 1;
        int next = 0;
        if (index == 1) return prev;
        if (index == 2) return current;

        for (int i = 2; i < index; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }

        return next;
    }

    private static int findFibonacciNumberByIndexRecursive(int index) {
        if(index == 1) return 0;
        if(index == 2) return 1;
        return findFibonacciNumberByIndexRecursive(index - 1) + findFibonacciNumberByIndexRecursive(index - 2);
    }

    public static void main(String[] args) {
        System.out.println(findFibonacciNumberByIndex(1));
        System.out.println(findFibonacciNumberByIndex(2));
        System.out.println(findFibonacciNumberByIndex(10));
        System.out.println(findFibonacciNumberByIndex(5));
        System.out.println(findFibonacciNumberByIndex(8));
        System.out.println(findFibonacciNumberByIndex(7));

        System.out.println(findFibonacciNumberByIndexRecursive(10));
    }
}
