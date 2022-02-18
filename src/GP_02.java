import java.util.Scanner;

public class GP_02 {
    public static void main(String[] args) {
        // 2: Create a 2D array of integer values. print the sum of all numbers.
        Scanner input = new Scanner(System.in);
        int[][] array = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        int sum=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                sum+=array[i][j];
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println("\nSum of array: "+sum);
    }
}
