// Logical operator && and
/*public class day3 {
    public static void main(String[] args) {
        System.out.println((3<2) && (5>0));
    }
}
*/

// Logical operator || or 
/*
public class day3 {
    public static void main(String[] args) {
        System.out.println((3<2) || (5>0));
    }
}
*/


// Logical operator ! not
/*public class day3 {
    public static void main(String[] args) {
        System.out.println(!(0>5));
    }
}
*/



// Assisgnment operator 
/*import java.util.*;
public class day3 {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        int D = 10;
        int C = 5;
        
        A+=10;
        B-=5;
        C*=5;
        D/=10;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

    }
    
}*/

//Problem
/*public class day3 {

    public static void main(String[] args){
    int x = 2, y = 5;
    int exp1 = (x * y / x);
    int exp2 = (x * (y / x));
    System.out.print(exp1 + "," );
    System.out.print(exp2);
    }
} */

// IF, Else Statment.
/*import java.util.*;
public class day3 {
    public static void main(String[] args) {
    Scanner as = new Scanner(System.in);
    int age = as.nextInt();
            if (age >= 24) {
            System.out.println("adult: drive, vote");            
        }
        if (age >13 && age <18) {
            System.out.println("you are teenager");            
        }
        else{
            System.out.println("your not adult");
        }
    }
    
}
*/


// Odd And Even;
/*import java.util.*;
public class day3 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int number = as.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");            
        } else {
            System.out.println("Odd");
        }
    }
    
}
*/

// Else-if statment;
/*import java.util.*;
public class day3 {
    public static void main(String[] args) {
    Scanner as = new Scanner(System.in);
    int age = as.nextInt();
        if (age >= 24) {
            System.out.println("adult: drive, vote");            
        }
        else if (age >13 && age <18) {
            System.out.println("you are teenager");            
        }
        else{
            System.out.println("your not adult");
        }
    }    
}
*/