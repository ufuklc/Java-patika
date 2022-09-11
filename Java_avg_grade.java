import java.util.Scanner;


public class Java_avg_grade {

    public static void main(String[] args) {

        int math,physics,turkish,chemistry,music,numerator=0,denominator=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your math grade: ");
        math= input.nextInt();
        if(math>=0 && math<=100 ) {
            numerator+=math;
            denominator++;

        }

        System.out.println("Please enter your physics grade: ");
        physics= input.nextInt();
        if(physics>=0 && physics<=100 ) {
            numerator+=physics;
            denominator++;

        }

        System.out.println("Please enter your Turkish grade: ");
        turkish= input.nextInt();
        if(turkish>=0 && turkish<=100 ) {
            numerator+=turkish;
            denominator++;

        }


        System.out.println("Please enter your chemistry grade: ");
        chemistry= input.nextInt();
        if(chemistry>=0 && chemistry<=100 ) {
            numerator+=chemistry;
            denominator++;

        }

        System.out.println("Please enter your music grade: ");
        music= input.nextInt();
        if(music>=0 && music<=100 ) {
            numerator+=music;
            denominator++;

        }

        double avg = (numerator/denominator);

        if (avg>=55) {

            System.out.println("Congratulations, you passed the class. Grade Average: "+avg);

        }else {

            System.out.println("Unfortunately, you did not meet the requirements to pass the class. Grade Average to pass the class is 55 but your average is "+avg);


        }






    }


    
}
