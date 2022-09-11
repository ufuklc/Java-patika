import java.util.Scanner;


public class Java_etkinlik {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Giriniz: ");

        int sicaklik = input.nextInt();

        if(sicaklik<5) {

            System.out.println("Kayak Yapabilirsiniz.");

            
        }else if(sicaklik>=5 && sicaklik<15) {

            System.out.println("Sinemaya Gidebilirsiniz.");

        }else if(sicaklik>=15 && sicaklik<25) {

            System.out.println("Piknik yapabilirsiniz.");

        }else {

            System.out.println("Yüzmeye Gidebilirsiniz.");

        }





    }
    
}
