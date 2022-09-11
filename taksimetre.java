import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        double price_per_Km= 2.20f;
        int opening_Price= 10;
        System.out.println("Lütfen Kaç KM gidildiğiniz yazınız: ");
        double km= input.nextDouble();
        double tutar=opening_Price+(km*price_per_Km);

        System.out.println(tutar<=20 ? "Ödenecek Tutar: "+20+" TL" : "Ödenecek Tutar: "+tutar+" TL");


    }
    
}
