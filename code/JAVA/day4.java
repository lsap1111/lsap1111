//Ternary operator
/*public class day4 {
    public static void main(String[] args) {
        int number = 22;
        String no =(( number % 2) == 0) ? "even": "odd";
        System.out.println(no);
    } 
}*/

// Switch Statment 
/*public class day4 {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("number 1");
                break;
            case 2 :
                System.out.println("number 2");
                break;
            default:
                System.out.println("number 3");            
                break;
        }
    }
    
}
*/

// While Loop;
/*public class day4 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("Hello World");            
            counter++;
        }
        System.out.println("you exceed 10");
    }
    
}
*/

// Problem Print no. 1-10;
/*public class day4 {

    public static void main(String[] args) {
        int counter = 0;
        while (counter<10) {
            System.out.println(counter);
            counter++;            
        }
        System.out.println("you exceed 10");
    }
}
*/

// Problem Print number user define;
/*import java.util.*;
public class day4 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int n = ad.nextInt();
        int counter = 0;
        while (counter < n) {
            System.out.println(counter);   
            counter++;         
        }
        System.out.println("you exceed no.");
    }
    
} */


// Problem print sum of n natural number'
/*import java.util.*;
public class day4 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();
        int sum = 0;

        int i=1;
        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println("sum is : "+ sum);
    }
    
}*/

// For loop;
/*public class day4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello world");           
        }
    }    
} */

// Print Star using for loop;
/*public class day4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }
    }
    
}*/

// print reverse of the no.
/*import java.util.*;
public class day4 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();

        while (n>0) {
            int lastDigit =n%10;
            System.out.print(lastDigit);
            n /= 10;
        }
        // System.out.println();
    }   
}*/

//Reverse the given number;
/*import java.util.*;
public class day4 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();
        int rev = 0;

        while (n>0) {
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;            
        }
        System.out.println(rev);
    }    
}
*/