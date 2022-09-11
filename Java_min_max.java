import java.util.Scanner;

public class Java_min_max {

    public static void main(String[] args) {

        int counter, number , min=1, max=1;


        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz ?");
        counter = input.nextInt();

        for(int i=1;i<=counter;i++){

            System.out.println(i+". Sayıyı Giriniz : ");
            number = input.nextInt();

            if(i==1){
                max=number;
                min=number;
            }
            
            if (number>max){
                max = number;
            }

            if(number<min){
                min = number;
            }



        }

        System.out.print("Min = "+min+"\nMax = "+max);


    }
    
}
