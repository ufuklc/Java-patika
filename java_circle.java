import java.util.Scanner;

public class java_circle {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Lütfen Yarı Çapını Giriniz: ");
        int r = input.nextInt();
        System.out.println("Lütfen Merkez Açısı Ölçüsünü Giriniz: ");
        double a = input.nextDouble();

        double pi=3.14f;
        double alan= (pi*(r*r)*a)/360;
        

        System.out.println("Daire'nin Alanı : "+alan);
        

    }

}