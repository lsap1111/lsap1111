//Array 
/*public class day10 {
    public static void update(int marks[], int nonchangable){
        nonchangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks [i] +=  1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {98, 99, 100, 12, 151, 161};
        int nonchangable = 5;
        update(marks, nonchangable);
        System.out.println(nonchangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
} */

// Linear Array 
/*import java.util.*;
public class day10 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n = as.nextInt();
        int number[] = {10, 15, 14, 18, 19, 55};
        int key = n;

        int index = linearArray(number, key);
        if (index == -1) {
            System.out.println("not found");
        }else {
            System.out.println("Key is at index: " + index);
        }

    }
    public static int linearArray(int number[], int key){
        for (int i = 0; i < number.length; i++) {
            if(number[i] == key){
                return i;
            }         
        }
        return -1;
    }
}*/ 
