import java.util.Scanner;

public class Java_asal_sayi {

    static void asal(int x){
        int sum=0;
        for(int i = 1;i<=x;i++){
            if(x%i==0){
                sum++;
            }
        }
        if(sum==2){
            System.out.println(x+" Bir Asal Sayıdır.");
        }else{
            System.out.println(x+" Bir Asal Sayı Değildir.");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz : ");

        int x = input.nextInt();

        asal(x);
    }
    
}

