public class GP_09 {

    public static void main(String[] args) {
        // 9. write a program that finds the second largest number in the array.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int a = 0;
        int b = 0;

        for (int i = 0; i < array.length; i++) {
            int c = array[i];
            if (c > a) {
                b = a;
                a = c;

            } else if (b < c && c != a)
                b = c;

        }   System.out.println(b);
    }
}
