public class GP_07 {
    public static void main(String[] args) {
        // 7. Write a program to print the first 10 numbers of Fibonacci series

        // The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        // The next number is found by adding up the two numbers before it:.
        int a = 0;
        int b = 1;
        int counter = 1;

        while (counter <= 10) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
            counter++;
        }

    }
}
