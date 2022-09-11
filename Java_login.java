import java.util.Scanner;

public class Java_login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username, password;

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        username = input.nextLine();

        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Başarıyla Yapıldı.");
        }else {
            System.out.println("Giriş Başarısız.");

            System.out.println("Şifrenizi Değiştirmek İstiyorsanız 1'e Basınız...");

            int choice= input.nextInt();

            if(choice==1) {
                Scanner inpt = new Scanner(System.in);

                System.out.println("Yeni şifrenizi giriniz: ");

                String newPassword = inpt.nextLine();

                if(newPassword.equals("java123")) {

                    System.out.println("Lütfen Farklı Bir Şifre Giriniz...");
                
                }
                else {

                    System.out.println("Yeni Şifreniz Başarıyla oluşturuldu...");
                }
            

            }else{
                System.out.println("Sistemden Çıkış Yapılıyor...");
            }

            

                    

            }

            

            }

            
        }

        
        





    
    

