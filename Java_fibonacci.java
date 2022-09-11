
import java.util.Scanner;
public class Java_fibonacci {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        System.out.print(" Sayi Giriniz:");

        int num = inp.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print(num + "Sayisinin Fibonacci Sayilari: ");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(t1 + " + ");

            int toplam = t1 + t2;
            t1 = t2;
            t2 = toplam;
        }
    }
}