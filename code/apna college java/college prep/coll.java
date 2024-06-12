// Area of the Rectangle;
/*import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int l = as.nextInt();
        int b = as.nextInt();
        int length = l;
        int breadth = b;
        System.out.println("area of the rectangle is: "+ length*breadth) ;

    }
} */

// EVEN NO.
/*import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        System.out.println("even no:  ");
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();

        for (int i = 2;  i <=n; i++) {
            if (i % 2 == 0) {
                System.out.println( i);
            }            
        }
        System.out.println();        
    }
}*/

/*import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();        
    }
}*/

// import java.util.*;
// public class coll {
//     public static void Employe(int number){
//         // int Employe id;
//     }
//     public static void main(String[] args) {
//         Scanner as = new Scanner(System.in);
//         String name = as.next();
//         System.out.println(name);


//     }
    
// }


/**
 * coll
 */

 class coll {

    int empid = 123;
    String name ="ak"; 
    int salary = 15000000;
    double pfrate = 0.10;

    int annualSalary(){
        int annual = salary*12;
        return annual;
    }

    double calculatePF(){
        double pf = salary*pfrate;
        return pf;
    }
  

    public static void main(String[] args) {
        coll e = new coll();
        int total = e.annualSalary();
        double pf = e.calculatePF();
        System.out.println("tot:  " + total);
        System.out.println("pf:  " + pf);
    }
}