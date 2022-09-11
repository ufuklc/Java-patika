import java.util.Scanner;

public class Java_atm {

    public static void main(String[] args) {


        String userName, passWord;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 5000;
        int select;
        boolean isLoginSuccess = false;

        while (!isLoginSuccess){
            System.out.println("Enter your username : ");
            userName = input.nextLine();
            
            System.out.println("Enter your password : ");
            passWord = input.nextLine();

            

            if (userName.equals("patika") && passWord.equals("dev123")) {
                System.out.println("You have successfully logged in. Please select the action you want to do.\n\n[1]-Deposit\n[2]-Withdraw\n[3]-Balance Inquiry\n[4]-Exit");
                isLoginSuccess=true;

                select = input.nextInt();
                switch(select){
                    case 1:
                    //Deposit
                        System.out.println("Current Balance : "+balance);
                        System.out.println("Please enter the amount to deposit : ");
                        int deposit = input.nextInt();

                        System.out.println("Your deposit has been successful.\nBalance : "+(balance+deposit));
                        

                    case 2:
                    //Withdraw
                        System.out.println("Current Balance : "+balance);
                        System.out.println("Please enter the amount to withdraw : ");
                        int withdraw = input.nextInt();
                        

                        if(withdraw<=balance){

                            System.out.println("Your deposit has been successful.\nBalance : "+(balance-withdraw));
                            
                        
                        }else {
                            System.out.println("Insuefficient amout");
                            
                        }

                    case 3:
                    //Balance Inquiry
                        System.out.println("Balance : "+balance);
                        

                    case 4:
                    //Exit
                        System.out.println("Hope to see you again...");
                        

                    
                    default:
                        System.out.println("Invalid Choice... ");
                        


                }
                
            }else{

                --right;

                if(right>0){

                    System.out.println("Wrong username or password please try again. Remaining Right : "+(right));
                    

                }else if(right==0){
                    System.out.println("Your account is blocked. Please contact with us.");
                    break;
                }
                

            }

        }

    }
    
}
