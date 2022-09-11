import java.util.Scanner;

public class Java_palindrom_numbers {

    static int isPalindrom(int num){

        int temp = num, reverseNumber=0, lastNumber;

        while(temp!=0){
            System.out.println("========");
            System.out.println("Sayı ====> "+temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak ====> "+lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayı ====> "+reverseNumber);

            temp/=10;

        }

        return reverseNumber;

        

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(isPalindrom(x)==x){
            System.out.print(x+ " Bir Palindrom Sayıdır.");
        }else{
            System.out.println(x+ " Bir Palindrom Sayı Değildir.");
        }
    }
    
}
