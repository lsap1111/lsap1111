//overloading using data type 
// public class day9 {

//     public static int sum(int a, int b){
//         return a+b;
//     }

//     public static float sum(float a, float b){
//         return a+b;
//     } 

//     public static void main(String[] args) {
//         System.out.println(sum(2, 9));
//         System.out.println(sum(3.5f, 8.5f));
//     }
// }

//prome or not 
// public class day9 {
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for (int i = 2; i<=n-1; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//             }
//         }
//         return isPrime;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(4));
//     }
// }

//prime in range
/**
 * day9
 */
// public class day9 {
//     public static boolean isPrime(int n){
//         if (n==2) {
//             return true;           
//         }
//         for (int i = 2; i <=Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;                
//             }
//         }
//         return true;
//     }    
//     public static void Primeinrange(int n) {
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i)) {
//                 System.out.println(i + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Primeinrange(55);
//     }
// }

/**
 * day9
 */
/*public class day9 {
    public static void binTodec(int binNum){
        int mYcoc = binNum;
        int pow = 0;
        int decNum = 0;
        
        while (binNum > 0) {            
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + mYcoc + " = " + decNum);
    }
    public static void main(String[] args) {
        binTodec(11001);      
    }
}*/

// Decimal to binary
/**
 * day9
 */
public class day9 {
    public static void Dectobin(int n){
        int coc = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++; 
            n = n/2;
        }
        System.out.println("Binary form of " + coc + " = " + binNum);
    }
    public static void main(String[] args) {
        Dectobin(55);
    }
}