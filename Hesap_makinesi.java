import java.util.Scanner;

public class Hesap_makinesi {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.print("1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi \n\n");

        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Menüden Seçiniz: ");

        int secim = input.nextInt();

        switch(secim) {

            case 1:
                System.out.println("Toplamak İstediğiniz Sayıları Sırasıyla Giriniz: ");
                int sayi1=input.nextInt();
                int sayi2=input.nextInt();
                float sonuc=sayi1+sayi2;

                System.out.println("Toplama İşlemi Sonucu: "+sonuc);
                break;

            case 2:
                System.out.println("Çıkarmak İstediğiniz Sayıları Sırasıyla Giriniz: ");
                int sayi3=input.nextInt();
                int sayi4=input.nextInt();
                float sonuc2=sayi3-sayi4;

                System.out.println("Çıkarma İşlemi Sonucu: "+sonuc2);
                break;

            case 3:
                System.out.println("Çarpmak İstediğiniz Sayıları Sırasıyla Giriniz: ");
                int sayi5=input.nextInt();
                int sayi6=input.nextInt();
                float sonuc3=sayi5*sayi6;

                System.out.println("Çarpma İşlemi Sonucu: "+sonuc3);
                break;

            case 4:
                System.out.println("Bölmek İstediğiniz Sayıları Sırasıyla Giriniz: ");
                int sayi7=input.nextInt();
                int sayi8=input.nextInt();
                float sonuc4=sayi7/sayi8;

                System.out.println("Bölme İşlemi Sonucu: "+sonuc4);
                break;

            default:
                System.out.println("Geçersiz Seçim...");
        }

        }



    }
    

