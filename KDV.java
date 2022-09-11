import java.util.Scanner;


public class KDV {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Fiyatı Giriniz. ");
        double fiyat = input.nextDouble();

        System.out.println("KDV'siz fiyat: "+fiyat);
        System.out.println(fiyat<=1000 && fiyat>=0 ? "KDV'li Tutar: " + (fiyat+(fiyat*0.18)) : "KDV'li Fiyat: "+(fiyat+(fiyat*0.08)));
        System.out.println(fiyat<=1000 && fiyat>=0 ? "KDV Oranı: "+0.18 : "KDV Oranı: "+0.08 );




    }
}
