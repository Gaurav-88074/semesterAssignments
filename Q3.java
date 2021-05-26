import java.util.Scanner;

class Matrix{
    public final static Scanner input = new Scanner(System.in);
    private int[][] matrix ;
    public Matrix(){
        matrix = new int[3][3];
    }
    public void readMatrix(){
        
        System.out.println("Please enter the values :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("MATRIX [%d][%d] : " , i,j );
                matrix[i][j] = input.nextInt();
            }
        }
    }
    public void MatrixMultiply(Matrix matrix1 ,Matrix matrix2){
       
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                // this.matrix[i][j]=0;      
                for(int k=0;k<3;k++){      
                    this.matrix[i][j]+=matrix1.matrix[i][k]*matrix2.matrix[k][j];      
                }//end of k loop  
            }
        }
        
    }
    public void display(Matrix matrix){
        System.out.println();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                System.out.print(matrix.matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
public class Q3 {
    
    public static void main(String[] args) {
        //---------------------------------
        System.out.println("\nMATRIX : 1");
        Matrix matrix1 = new Matrix();
        matrix1.readMatrix();
        System.out.println("MATRIX : 2");
        Matrix matrix2 = new Matrix();
        matrix2.readMatrix();
        // System.out.println("MATRIX AFTER MULTIPLICATION : ");
        Matrix matrix3 = new Matrix();
        matrix3.MatrixMultiply(matrix1, matrix2);
        System.out.println("\nDisplaying Your matrices : ");
        System.out.println("MATRIX : 1");
        matrix1.display(matrix1);
        System.out.println("MATRIX : 2");
        matrix1.display(matrix2);
        System.out.println("MATRIX AFTER MULTIPLICATION : ");
        matrix1.display(matrix3);

    }
}
