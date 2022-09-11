import java.util.Scanner;


public class Java_loop_practise5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(("For x^y , Enter a value for x : "));
        int x = input.nextInt();
        int result = x;

        System.out.println(("For x^y , Enter a value for y : "));
        int y = input.nextInt();

        for (int i = 1 ; i<=(y-1) ; i++) {

            result*=x;
        }

        System.out.print("For "+x+"^"+y+", Result : "+result);
    }
    
}
