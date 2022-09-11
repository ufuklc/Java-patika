import java.util.Scanner;
public class java_manav{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutFiyat= 2.14f;
        double elmaFiyat= 3.67f;
        double domatesFiyat= 1.11f;
        double muzFiyat= 0.95f;
        double patlicanFiyat= 5;

        System.out.println("Armut Kaç Kilo ? ");
        double armutKilo= input.nextDouble();
        System.out.println("Elma Kaç Kilo ? ");
        double elmaKilo= input.nextDouble();
        System.out.println("Domates Kaç Kilo ? ");
        double domatesKilo= input.nextDouble();
        System.out.println("Muz Kaç Kilo ? ");
        double muzKilo= input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? ");
        double patlicanKilo= input.nextDouble();

        double tutar=(armutFiyat*armutKilo)+(elmaFiyat*elmaKilo)+(muzFiyat*muzKilo)+(patlicanKilo*patlicanFiyat)+(domatesFiyat*domatesKilo);

        System.out.println("Ödeyeceğiniz toplam tutar : "+tutar+" TL");

    }
}