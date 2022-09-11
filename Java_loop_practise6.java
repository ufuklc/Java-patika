import java.util.Scanner;




public class Java_loop_practise6 {

    public static void main(String[] args) {

        int number;
        int counter = 0;
        int digitNumber = 0;
        int total = 0;
        int helper;
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter a number: ");
        number = input.nextInt();
        int tempnumber=number;

        while(tempnumber!=0){
            tempnumber/=10;
            counter++;
            digitNumber = counter;
        }

        tempnumber = number ;

        for(int i = 1 ; i<=digitNumber ; i++) {

            helper = tempnumber%10;
            total+=helper;
            tempnumber = tempnumber/10;


        }

        System.out.print("Total : "+total);
       


    }
    
}
