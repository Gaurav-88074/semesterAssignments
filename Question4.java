import java.util.Scanner;
public class Question4 {
    public static void displayArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <=i; j++) {
                
                System.out.print(array[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] array =new int[6][];
        array[0]  = new int[1];
        array[1]  = new int[2];
        array[2]  = new int[3];
        array[3]  = new int[4];
        array[4]  = new int[5];
        array[5]  = new int[6];
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <=i; j++) {
                array[i][j] = value++;
            }
        }
        displayArray(array);

        
        System.out.println();
    }
}
