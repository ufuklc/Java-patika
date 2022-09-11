import java.util.Scanner;
// Factorial
public class Java_loop_practise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("C(n,r), Please enter a value for 'n' : ");
        int n = input.nextInt();

        System.out.println("C(n,r), Please enter a value for 'r' : ");
        int r = input.nextInt();

        int n_Factorial = 1;
        int r_Factorial = 1;
        int n_r_Factorial = 1;


        for (int i=1;i<=n;i++) {

            n_Factorial*=i;

        }

        for (int i=1;i<=r;i++) {

            r_Factorial*=i;

        }

        for (int i=1; i <= (n-r); i++) {

            n_r_Factorial*=i;
        }

        double result = n_Factorial/(r_Factorial*n_r_Factorial);
        System.out.println("For C(n,r) Result : "+result);

    }
    
}

