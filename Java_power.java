import java.util.Scanner;


public class Java_power {

    static int power(int x, int y){
        int result = 1;
        for(int i=1;i<=y;i++){
            result*=x;
        }

        return result;
    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("For x^y enter a number for x: ");
        int x = input.nextInt();

        System.out.println("For x^y enter a number for y: ");
        int y = input.nextInt();

        System.out.println("Result for "+x+"^"+y+" = "+ power(x,y));


    }
    
}
