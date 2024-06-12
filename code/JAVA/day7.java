// swaqpping of the number;
/*import java.util.*;
public class day7 {
    public static void swapping(int a, int b){
        int temp  = a;
        a = b;
        b = temp;
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
    }
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        int b = as.nextInt();
        swapping(a, b);
    }
} */

// multiply;
/*import java.util.*;
public class day7 {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();   
        int b = as.nextInt();
        int prod = multiply(a, b);
        System.out.println("product of a number:" + prod);   
    }
}*/

// factorial of the number.
/**
 * day7
 import java.util.*;
 public class day7 {
     public static int factorial(int n){
         int f = 1;
         
         for (int i = 1; i <= n; i++) {
             f = f*i;
            }
            return f;
        }
        
        public static void main(String[] args) {
            Scanner as = new Scanner(System.in);
            int n = as.nextInt();
            System.out.println(factorial(n));
        }
    }*/
    
// Binomial coefficient;
/*import java.util.*;
public class day7 {
    public static int factorial(int n){
        int f = 1;     
        for (int i = 1; i <= n; i++) {
            f = f*i;
           }
           return f;
       }
    public static int binomialcoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binomialcoff = fact_n / (fact_r * fact_nmr );
        return binomialcoff;
    }  
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        int n = as.nextInt(); 
        int r = as.nextInt(); 
        System.out.println(binomialcoff(n, r));
    }
    
};*/

//  Function overloading using different parameter;
/*public class day7 {
    public static int mu(int a, int b){
        return a+b;
    }
    public static int mu(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(mu(2, 5));
        System.out.println(mu(2, 5, 7));

    }
}*/

// Function overloading using 
/**
 * day7
 */
public class day7 {

    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 5));   
        System.out.println(sum(4.6f, 6.5f));
    }
}
