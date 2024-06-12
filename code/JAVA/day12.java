// reversing the array
/*public class day12 {
    public static void main(String[] args) {
        int number[] = {1,2,5,7,3,4,6};

        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int number[]){
        int first = 0, last = number.length-1;

        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }
} */

// PAir of the number
/*public class day12{
    public static void main(String[] args){
        int number[] = {1, 2, 3, 4, 5};

        pairOfarray(number);
    }

    public static void pairOfarray(int number[]){
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair: " + tp);
    }
}*/

// Sub-Array;
/*public class day12 {

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};

        SubArray(number);
    }

    public static void SubArray(int number[]){
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <=end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("total: " + ts);
    }
}*/

// Max sum of the array;
/*public  class day12 {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        maxSum(number);
    }

    public static void maxSum(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int Start  = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = Start; k <= end; k++) {
                    currsum += number[k];    
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }System.out.println();
        }
        System.out.println("Max Sum = " + maxsum);
    }
}*/

// using prefix array;
/*public  class day12 {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        maxSum(number);
    }

    public static void maxSum(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int Start  = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum = Start == 0 ? prefix[end] : prefix[end] - prefix[Start-1];
            
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max Sum = " + maxsum);
    }
}*/

//Using KADANE'S Algorithm;
/**

public class day12 {

    public static void main(String[] args) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        maxSum(number);
    }

    public static void maxSum(int number[]){
        int cs = 0;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            mx = Math.max(cs, mx);
        }
        System.out.println(" Max. Sum is: " + mx);
    }
} */

