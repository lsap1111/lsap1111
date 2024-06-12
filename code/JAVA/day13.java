//Bubble Sort
// public class day13{
//     public static void main(String [] args){
//         int array[] = {5,4,3,2,1};
//         bubbleSort(array);
//         printArray(array);
//     }

//     public static void bubbleSort(int array[]){
//         for (int turn = 0; turn < array.length-1; turn++) {
//             for (int i = 0; i < array.length-1-turn; i++) {
//                 if (array[i] > array[i+1]) {
//                     int temp = array[i];
//                     array[i] = array[i+1];
//                     array[i+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArray(int array[]){
//         for (int j = 0; j < array.length; j++) {
//             System.out.print(array[j] + " ");            
//         }
//         System.out.println();
//     }
// }


// Selection sort 
public class day13 {
    public static void main(String[] args){
        int arr[] = {8, 6, 4, 1, 3, 7};
        selctionsort(arr);
        aRRay(arr);
    }
    
    public static void selctionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos= j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void aRRay(int arr[]){
        for (int j = 0; j < arr.length; j++) {
           System.out.print(arr[j] + " ");
        } 
        System.out.println();
    }
}
