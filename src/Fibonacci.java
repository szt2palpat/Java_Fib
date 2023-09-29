public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("fibonacci(" + n + ") = " + fibonacci(n));
        System.out.println("fibonacciRec(" + n + ") = " + fibonacciRec(n));
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatív bemenet érvénytelen.");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    public static int fibonacciRec(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatív bemenet érvénytelen.");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
}
