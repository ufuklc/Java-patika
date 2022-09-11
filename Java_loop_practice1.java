import java.util.Scanner;
//* Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. */
public class Java_loop_practice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int i = input.nextInt();
        int count_for=0;
        int count_while=0;
        int sum_w_for = 0;
        int sum_w_while = 0;
        for(int x=0;x<=i;x++){
            if (x%3==0 || x%4==0){

                count_for++;

                sum_w_for+=x;

                


            }
        }
        double avg_for=sum_w_for/(count_for-1);
        System.out.println("Average with For = "+avg_for);

        
        int x_while=0;

        while(x_while<=i){

            if(x_while%3==0 || x_while%4==0){

                sum_w_while+=x_while;
                count_while++;
            }
            x_while++;

        }
        double avg_while = sum_w_while/(count_while-1);
        
        System.out.println("Average with While = "+avg_while);
    }
    
}
