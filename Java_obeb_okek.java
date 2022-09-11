import java.util.Scanner;

public class Java_obeb_okek {

    public static void main(String[] args) {

        int num1, num2 , big, small , ebob=0, ekok=0;


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 1. Sayıyı Giriniz : ");
        num1 = input.nextInt();

        System.out.println("Lütfen 2. Sayıyı Giriniz : ");
        num2 = input.nextInt();

        if (num1>num2) {
            big = num1;
            small = num2;
        }else{
            
            big = num2;
            small = num1;
        }

        
        

        while (small>=1){
            if (big%small==0){

                ebob=small;


            }else{
                ebob += (big%small);
            }

            ekok +=((num1*num2)/(ebob));

            break;

        }

        System.out.println("EBOB = "+ebob);
        System.out.println("EKOK = "+ekok);


    }
    
}
