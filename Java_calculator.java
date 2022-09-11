import java.util.Scanner;

public class Java_calculator{


    static int sum(int x1, int x2){

        int result = x1 + x2;
        System.out.println("Result : "+result +  "\n\n\n");
        return result;
    }

    static int substraction(int x1, int x2){

        int result = x1 - x2;
        System.out.println("Result : "+result +  "\n\n\n");
        return result;
    }

    static int multiply(int x1, int x2){

        int result = x1 * x2;
        System.out.println("Result : "+result + "\n\n\n");
        return result;
    }

    static int divide(int x1, int x2){

        int result = x1 / x2;
        System.out.println("Result : "+result + "\n\n\n");
        return result;
    }

    static int power(int x1, int x2){

        int result = 1;
        for(int i = 1 ; i<=x2 ; i++){
            result*=x1;
        }

        System.out.println("Result : "+result + "\n\n\n");

        return result;

        
    }

    static int factorial(int x1){

        int result = 1;

        for(int i = x1 ; i>=1 ; i--){

            result*=i;

        }

        System.out.println("Result : "+result + "\n\n\n");

        return result;



    }

    static int mod(int x1,int x2){
        
        int result = x1%x2;
        System.out.println("Result : "+result + "\n\n\n");
        return result;


    }

    static int rectangle_circ(int x1,int x2){
        
        int circumference = (x1+x2)*2;
        int area = x1*x2;

        System.out.println("Circumference : " + circumference);
        System.out.println("Area : " + area + "\n\n\n");

        return area;
        


    }

    
    static int rectangle_area(int x1,int x2){

        int area = x1*x2;
        
        System.out.println("Area : " + area);

        return area;
        


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select;

        String menu = "\n\n[1] - Sum\n[2] - Substraction\n[3] - Multiplication\n[4] - Division\n[5] - Power\n[6] - Factorial\n[7] - Mod\n[8] - Circumference of Rectangle\n[9] - Area of Rectangle\n[0] - Exit\n\n";

        do{
            System.out.println(menu);
            System.out.println("Please select a process : ");
            select = input.nextInt();

            switch(select){
                case 1:
                    System.out.print("Please enter the first number : ");
                    int a = input.nextInt();
                    System.out.print("Please enter the second number : ");
                    int b = input.nextInt();

                    sum(a,b);
                    break;
                
                case 2:
                    System.out.println("Please enter the first number : ");
                    int c = input.nextInt();
                    System.out.println("Please enter the second number : ");
                    int d = input.nextInt();

                    substraction(c,d);
                    break;
                
                case 3:
                    System.out.println("Please enter the first number : ");
                    int e = input.nextInt();
                    System.out.println("Please enter the second number : ");
                    int f = input.nextInt();

                    multiply(e,f);
                    break;
                
                case 4:
                    System.out.println("Please enter the first number : ");
                    int g = input.nextInt();
                    System.out.println("Please enter the second number : ");
                    int h = input.nextInt();

                    divide(g,h);
                    break;
                
                case 5:
                    System.out.println("Please enter the first number : ");
                    int x = input.nextInt();
                    System.out.println("Please enter the second number : ");
                    int y = input.nextInt();

                    power(x,y);
                    break;

                case 6:
                    System.out.println("Please enter a number : ");
                    int z = input.nextInt();
                    

                    factorial(z);
                    break;
                
                case 7:
                    System.out.println("Please enter the first number : ");
                    int x1 = input.nextInt();
                    System.out.println("Please enter the second number : ");
                    int x2 = input.nextInt();

                    rectangle_circ(x1, x2);
                    break;
                
                case 8:
                    System.out.println("Please enter the first number : ");
                    int x3 = input.nextInt();
                    System.out.println("Please enter the second number : ");
                    int x4 = input.nextInt();

                    rectangle_area(x3,x4);
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Insuefficient Choice. Please try again...");    
            }
        }

        while(select!=0);
        System.out.println("Thanks for your interest.");
    }


    }
