import java.util.Scanner;

public class Java_loop_practise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int n = input.nextInt();

        for (int i=1;i<=n;i*=4) {

            System.out.println(i);

        }
        for (int i=1;i<=n;i*=5) {

            System.out.println(i);

        }
    }
    
}
