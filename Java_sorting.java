import java.util.Scanner;

public class Java_sorting {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("Lütfen 3. sayıyı giriniz: ");
        c = input.nextInt();

        if (a >b && a>c) {
            if (b>c) {

                System.out.print("a>b>c");

                
            }else{

                System.out.print("a>c>b");
                
            }
        }else if (b>a && b>c) {
            if(a>c){

                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }


        }else{
            if(a>b){
                System.out.print("c>a>b");
            }else{
                System.out.print("c>b>a");
            }
        }



    }
    
}
