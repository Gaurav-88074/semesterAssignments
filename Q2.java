import java.util.Scanner;

public class Q2 {
    public static float feetToInches(float feet){
        return (float)feet * 12;
    }
    public final static Scanner input = new Scanner(System.in);
    public static void loopCheck(){
        String name;
        float    height;
        boolean loopCondition =true;
        do{
            System.out.print("Enter Your Height : ");
            height = input.nextFloat();
            System.out.print("Enter Your Name   : ");
            name   = input.next();
            input.nextLine();
            if (name.length()<10 && height<6) {
                System.out.println("Your Name   IS : "+name);
                System.out.printf("Your Height IS : %.2f\n",feetToInches(height));
                System.out.println();
            } else {
                
                break;
            }
            System.out.println();
            

        }while(loopCondition);
    }
    public static void main(String[] args) {
        loopCheck();
    }
}
