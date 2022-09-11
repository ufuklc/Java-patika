import java.util.Scanner;


public class Java_chinese_zodiac {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int year = input.nextInt();

        if (year%12==0) {

            System.out.print("Your chinese zodiac sign : Monkey");

        }


        else if(year%12==1){

            System.out.print("Your chinese zodiac sign : Rooster");

        }

        
        else if(year%12==2){

            System.out.print("Your chinese zodiac sign : Dog");

        }

        
        else if(year%12==3){

            System.out.print("Your chinese zodiac sign : Pig");

        }        
        
        else if(year%12==4){

            System.out.print("Your chinese zodiac sign : Rat");

        }        
        
        else if(year%12==5){

            System.out.print("Your chinese zodiac sign : Ox");

        }        
        
        else if(year%12==6){

            System.out.print("Your chinese zodiac sign : Tiger");

        }        
        
        else if(year%12==7){

            System.out.print("Your chinese zodiac sign : Rabbit");

        }        
        
        else if(year%12==8){

            System.out.print("Your chinese zodiac sign : Dragon");

        }        
        
        else if(year%12==9){

            System.out.print("Your chinese zodiac sign : Snake");

        }        
        
        else if(year%12==10){

            System.out.print("Your chinese zodiac sign : Horse");

        }        
        
        else{

            System.out.print("Your chinese zodiac sign : Goat");

        }


        

        


    }
    
}
