//
/*public class day19 {
    public static void main(String[] args) {
        System.out.println((5&6));
        System.out.println((5 | 6));
        System.out.println((5 ^ 6));
        System.out.println((~ 0));
        System.out.println((5 << 2));
        System.out.println((6 >> 1));
    }
}*/

//p
/*import java.util.*;
public class day19{
    public static void main(String args[]){
        Scanner as = new Scanner(System.in);
        int x = as.nextInt();
        oddOreven(x);
        as.close();
    } 
     
    public static void oddOreven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}*/

//get
/*import java.util.*;
public class day19{
    public static void main(String args[]){
        System.out.println(getIthbit(10, 2));
    }

    public static int getIthbit(int n, int i){
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }
}*/

//📐set
/*public class day19{
    public static void main(String args[]){
        System.out.println(Setithbit(10, 2));
    }

    public static int Setithbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
} */

//Clear
/*import java.util.*;
public class day19{
    public static void main(String args[]){
        Scanner as = new Scanner(System.in);
        int v = as.nextInt(); 
        int w = as.nextInt(); 
        System.out.println(Clearithbit(v, w));
        as.close();
    }

    public static int Clearithbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
}*/

//Update
/*import java.util.*;
public class day19{
    public static void main(String args[]){
        Scanner as = new Scanner(System.in);
        int x = as.nextInt(); 
        int v = as.nextInt(); 
        int w = as.nextInt(); 
        // System.out.println(Clearithbit(v, w));
        System.out.println(updateIthbit(x, v, w));
        as.close();
    }

    public static int Setithbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int Clearithbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthbit(int n, int i, int newBit){
        if (newBit == 0) {
            return Clearithbit(n, i);
        }else{
            return Setithbit(n, i);
        }
    }
}*/

//clear last ith bit;
/*import java.util.*;
public class day19{
    public static void main(String args[]){
        Scanner as = new Scanner(System.in);
        int v = as.nextInt(); 
        int x = as.nextInt(); 
        System.out.println(Clearithbit(v, x));
        as.close();
    }

    public static int Clearithbit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
} */

//Checking if the number have power or not;
/*import java.util.*;
public class day19 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        System.out.println(PowerOftwo(a));
        as.close();
    }

    public static boolean PowerOftwo(int n){
        return (n&(n-1)) == 0;
    }
}*/

//Clear range of the number;
/*import java.util.*;
public class day19 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int x = as.nextInt();
        int y = as.nextInt();
        int z = as.nextInt();
        System.out.println(Range(x, y, z));
        as.close();
    }

    public static int Range(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
}*/

//Count Set bit's in a number
/*public class day19 {
    public static void main(String[] args) {
        System.out.println(Countsetbits(12));
    }

    public static int Countsetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) = 0) { // checking LSB
              
            }
            n = n >> 1;
        }
    }
} */
        

// Fast Exponential prob.;
/*public class day19{
    public static void main( String[] args){
        System.out.println(fastExpo(5, 3));
    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while (n > 0) {
            if ((n & 1) !=0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
}*/