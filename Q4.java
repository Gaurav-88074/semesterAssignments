import java.util.Scanner;

public class Q4 {
    public final static Scanner input = new Scanner(System.in);
    public static void checkPassword(){
        String password1 = "pubgindia" ;
        String password2 = "javascript";
        do{
            System.out.print("\nPlease enter your password : ");
            String userPassword = input.nextLine();
            if(userPassword.equals(password1) || userPassword.equals(password2)){
                System.out.println("\nWELCOME USER!");
                break;
            }
            System.out.println("Incorrect password !!");
        }while(true);
    }
    public static void main(String[] args) {
        checkPassword();
    }
}
