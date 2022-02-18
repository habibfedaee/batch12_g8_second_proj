import java.util.Scanner;

public class GP_01 {
    public static void main(String[] args) {
        // Create an array of integer values using a scanner and calculate the sum of all stored
        // elements in that array.

        Scanner input = new Scanner(System.in);
        int size = 8;      int[] array = new int[size];   int sum=0;
        for(int i=0; i<size; i++){
            System.out.print("Enter a number: ");
            array[i]=input.nextInt();
            sum+=i;
        }
        System.out.println("Array size: "+size);
        for(int x=0; x<size; x++){
            System.out.print(array[x]+" ");
        }
        System.out.println(", Sum of all elements: "+sum);
    }
}
