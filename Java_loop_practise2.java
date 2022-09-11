import java.util.Scanner;
// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
public class Java_loop_practise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int total=0;
        
        do{
            System.out.print("Please enter a number: ");
            num = input.nextInt();

            if(num%2==0 || num%4==0) {
                total+=num;
            }


            



        } while(num%2==0);

        System.out.print("Total = "+total);

    }
    
}
