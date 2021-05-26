// // // public class rough{
// // //     public static void main(String[] args) {
// // //         System.out.print("\033[H\033[2J"); 
// // //     }
// // // }
// class MATRIX1 {
//     int a[][], rows, cols;
//     void readMatrix() { }
//     MATRIX1 Multiply(MATRIX1 b) throws Exception {
//         if (this.rows != b.cols) {
//             throw new Exception("Invalid matrix, matrix cannot be multiplied.");
//         }
//         MATRIX1 result;
//         result.a = new int[this.rows][b.cols];
//         result.rows = this.rows;
//         result.cols = b.cols;
//         for(int i=0; i<result.rows; i++) {
//             for(int j=0; j<result.cols; j++) {
//                 for(int k=0; k<this.cols; k++) {
//                     result.a[i][j] = 0;
//                     result.a[i][j]+= this.a[i][k] * b.a[k][j];
//                 }
//             }
//         }
//         return result;
//     }
// }