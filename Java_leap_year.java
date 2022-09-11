import java.util.Scanner;

public class Java_leap_year {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        if (year%4==0){
            if (year%100==0 && year%400!=0){
                System.out.print(year + " is not a leap year.");
            }else {
                System.out.print(year + " is a leap year.");
            }
        }else{
            System.out.print(year + " is not a leap year.");
        }









    }
    
}
