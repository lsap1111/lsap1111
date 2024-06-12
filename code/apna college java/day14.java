/*
public class day14 {
    public static void main(String[] args) {
        int arr[] = {2,4,1,7,8};
        insetionSort(arr);
        ArraY(arr);
    }
    
    public static void insetionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) { //finding out current poss to insert;
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    public static void ArraY(int arr[]){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    } 
}
*/

/**
 * day14
 */
public class day14 {
    public static void main(String[] args) {
        int arr[] = { 7,8,6,2,4,1,1,5,4};
        COUNTINGsORT(arr);
        ArraY(arr);
    }
    
    
    public static void COUNTINGsORT(int arr[]){
        int largest = Integer.MIN_VALUE; // range or the largest element
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);        
        }
        
        int count[] = new int[largest+1]; // Count array from 0 to n;
        for (int i= 0; i < arr.length; i++) {
        count[arr[i]]++;//update count of arr, here we are moving on the 1 array; 
        }

        int j = 0;//updating array;
        for (int  i =0; i < count.length; i++){//here we will deal with second array, sort array;
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }    
    
    public static void ArraY(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}