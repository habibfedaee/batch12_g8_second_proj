public class GP_04 {
    public static void main(String[] args) {
        // 4. Create a 2D array of integers. Develop a program which will calculate the sum
        // of even and odd numbers for that array.

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},  {11, 12, 13, 14, 15}  };
        int sumEven=0;         int sumOdd=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
                if(array[i][j]%2==0){
                    sumEven+=array[i][j];
                } else {
                    sumOdd+=array[i][j];
                }
            }
        }
        System.out.println("\nSum of Evens: "+sumEven);
        System.out.println("Sum of Odds: "+sumOdd);
    }
}
