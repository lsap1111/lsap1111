// import java.util.*;
// public class day15{
//     public static void main(String [] args){
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;

//         Scanner as = new Scanner(System.in);
//         int z = as.nextInt();
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 matrix[i][j] = as.nextInt();
//             }
//         }

//         for(int i = 0; i < n; i ++){
//             for(int j = 0; j < m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//         }
//         System.out.println();
//         search(matrix,z);
//         as.close();
//     }

//     public static boolean search(int matrix[][], int key){
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j]==key) {
//                     System.out.println("found at cell ("+i+","+j+")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("key not found");
//         return false; 
        
        
//     }
// }



import java.util.*;
public class day15{
    public static void main(String args[]){
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner as = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j]= as.nextInt();
                as.close();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}