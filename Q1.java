import java.util.Scanner;
public class Q1 {
    public static long factorial(int number){
        if(number==0 || number==1){
            return 1;
        }
        else{
            return number * factorial(number-1);
        }
    }
    public static double sumOFSeries(int number){
        double result = 1;
        if(number==1){
            return result;
        }
        else{
            for (int i = 2; i <=number; i++) {
                if (i%2==0) {
                    result = result -  (double)1/factorial(i);
                } else {
                    result = result +   (double)1/factorial(i);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number of terms : ");
        int terms =  input.nextInt();
        double result = sumOFSeries(terms);
        System.out.println();
        System.out.printf("The value is : %.2f",result);


    }
}
