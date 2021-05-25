//To find the factorial of a given number
import java.util.Scanner;
public class Question2 {
    int factorial(int number){
        if(number==0 || number==1){
            return 1;
        }
        return number * factorial(number-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Question2 factorial = new Question2();
        System.out.print("Enter the number to find factorial : ");
        int number = input.nextInt();
        System.out.print("\nThe factorial of "+number+" is : ");
        System.out.println(factorial.factorial(number));
        input.close();
    }
}