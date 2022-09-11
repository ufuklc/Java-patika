import java.util.Scanner;

//Harmonic Series

public class Java_loop_practice7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number : ");

        int num = input.nextInt();

        double total = 0;

        for(double i=1 ; i<=num ; i++){

            total+=(1/i);
        }

        System.out.println("Harmonic Series of "+num+" : "+total);

    }
    
}
