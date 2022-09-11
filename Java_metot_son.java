import java.security.cert.X509CRLEntry;
import java.util.Scanner;

public class Java_metot_son {

    static void desen(int x){
        boolean isTrue=true;
        int y=x;
        System.out.print(x+" ");
        while (isTrue){
            
            x-=5;
            System.out.print(x+" ");
            if( x<=0){
                while(x<y){
                    x+=5;
                    System.out.print(x+" ");
                    if(x==y){
                        isTrue=false;
                    }
                }

            }
        
        }
        
        
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int x = input.nextInt();
        desen(x);
    }
    
}
