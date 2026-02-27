public class MathDemo {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number must be non-negative");

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
/*
The advantage of defining these methods as static is that
we can use them without creating an object of the class.
Since the methods in MathDemo only perform mathematical
calculations and do not depend on any object data, it 
is easier and more practical to make them static. This
allows us to call them directly using the class name,
such as MathDemo.min(5, 3)
 */