import java.util.Scanner;
import java.lang.Math;

public class java_triangle_area_calc {
    public static void main (String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen Üçgenin Kenarlarını Giriniz: ");

        int kenar1= input.nextInt();
        int kenar2= input.nextInt();
        int kenar3= input.nextInt();
        double cevre= (kenar1+kenar2+kenar3)/2;
        double u=cevre/2;

        System.out.println("Üçgenin çevresi: "+cevre);

        double alan_kare=(u)*(u-kenar1)*(u-kenar2)*(u*kenar3);

        System.out.println("Üçgenin alanı: "+Math.sqrt(alan_kare));







    }
    
}
