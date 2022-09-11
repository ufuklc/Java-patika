import java.util.Scanner;

public class java_bmi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("LÜtfen boyunuzu cm cinsinden giriniz: ");
        int boy= input.nextInt();
        System.out.println("LÜtfen kilonuzu kilogram cinsinden giriniz: ");
        int kilo=input.nextInt();

        double bmi= kilo/((boy/100)*(boy/100));

        System.out.println("Vücut Kitle Endeksiniz: "+bmi);




        

    }
}