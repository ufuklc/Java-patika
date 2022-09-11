import java.util.Scanner;

public class Java_mukemmel_sayi {

    public static void main(String[] args) {

        int num, sum=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");

        num = input.nextInt();

        for(int i = 1; i<=num; i++){

            if(num%i==0){
                sum++; // Sayımızı kalansız bölen her i değeri için sum değerimiz 1 arttırılır.
            }
        
        }

        if(sum==2){  // Sum değerimiz 2 ise bu iki sayı ancak 1 ve sayımızın kendisi olabilir. Bu yüzden sum değeri 2 olan sayımıza asal sayı diyebiliriz.
            System.out.println(num + " Mükemmel Sayıdır.");
        }else{
            System.out.println(num + " Mükemmel Sayı Değildir.");
        }
    }
    
}
