// revrse pattern;
/*import java.util.*;;
public class day6 {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        int x = as.nextInt();

        for (int line = 1; line <= x; line++) {
            for (int star = 1; star <= (x-line+1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
};*/


//print half pyramid;
/*import java.util.*;
public class day6 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();

        for (int line = 1; line <= n; line++) {
            for ( int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}*/

//Print Character;
/*import java.util.*;
public class day6 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();
        Character ch = 'A';

        for (int line = 1; line <= n; line++) {
            for (int ok = 1; ok <= line; ok++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }  
};*/


// function;
/*public class day6 {
    public static int okgoogle(){
        System.out.println("ok google");
        System.out.println("123");
        return 1;
    }

    public static void rk(){
        System.out.println("namaskar");
    }
        public static void main(String[] args) {
            okgoogle();
            rk();
    }
    
}*/

// function using parameter;
/*import java.util.*;  12
public class day6 {
    public static void sumcal(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("sum of a and b :" + sum);
    }
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        int b = as.nextInt();
        sumcal(a, b);
    }
};*/