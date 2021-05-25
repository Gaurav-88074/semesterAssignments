import java.util.Scanner;

// import jdk.internal.util.xml.impl.Input;
public class Question3 {
    void addFiveInEachElement(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]+=5;
        }
    }
    void displayArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    void insertElementInArray(int[] array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("\nEnter the value of ARRAY["+i+"] :");
            array[i] = input.nextInt();
        }
        System.out.println();
        input.close();
    }
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        Question3 Array = new Question3();
        System.out.print("Enter the size of a array : ");
        int[] array     = new int[input.nextInt()];
        Array.insertElementInArray(array);
        System.out.println("Array before adding 5 : ");
        Array.displayArray(array);
        Array.addFiveInEachElement(array);
        System.out.println("Array after adding 5 : ");
        Array.displayArray(array);
        input.close();  
        


    }
}
