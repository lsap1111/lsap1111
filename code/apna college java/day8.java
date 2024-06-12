// Boolean number;
// public class day8 {
//     public static void bintodec(int binNum){
//         int mynumber = binNum;
//         int pow = 0; 
//         int decNum = 0;

//         while(binNum > 0){
//             int lastDigit = binNum % 10;
//             decNum = decNum + ( lastDigit * (int)Math.pow(2, pow));

//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println("decimal of " + mynumber + "=" + decNum);
//     }
//     public static void main(String[] args) {
//         bintodec(10111);        
//     }    
// }


//prime number;
//import java.util.*;
// public class day8 {
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for (int i = 2; i <= n-1; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 // break;
//             }
//         }
//         return isPrime;
//     }
//     public static void main(String[] args) {
//         Scanner as = new Scanner(System.in);
//         int n = as.nextInt();
//         System.out.println(isPrime(n));
//     }
// }