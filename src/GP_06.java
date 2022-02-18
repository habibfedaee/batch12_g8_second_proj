import java.util.Scanner;

public class GP_06 {
    public static void main(String[] args) {
        // 6. Write a java program to check whether a given number is prime or not?
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+ " is a Prime number!");
        } else {
            System.out.println(num+ " is not a Prime number!");
        }

    }
}
