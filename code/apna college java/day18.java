/*import java.util.*;
public class day18 {
    public static void main(String ards[]){
        char arr[] = {'a', 'b', 'c' , 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        Scanner as = new Scanner(System.in);
        String name;
        name = as.nextLine();
        System.out.println(name);
        as.close();
    }
}*/

//finding the length of the String;
/*public class day18 {
    public static void main(String args[]){
        String fullName = "LSAP";
        System.out.println(fullName.length());
    }
}*/

//String Concatenation;
/*public  class day18{
    public static void main(String args[]){
        String firstname = "LSAP";
        String lastname = "lsap";
        String Fullname = firstname + " " + lastname;
        System.out.println(Fullname);
    }
}*/

//String charat method;
/*public class day18{
    public static void main(String args[]){
        String firstname = "LSAP";
        String lastname = "lsap";
        String Fullname = firstname + " " + lastname;
        printletter(Fullname);
    }

    public static void printletter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}*/

//String is palindrome;
/*public class day18 {

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(Palindrome(str));
    }

    public static boolean Palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
}*/

//problem  find the shortest path;
/*public class day18{
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(shortestpath(path));
    }

    public static float shortestpath(String path){
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //South
            if (dir == 'S') {
                y--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //West
            else if (dir == 'w') {
                x--;
            }
            //East
            else {
                x++;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
}*/

//String are equal or not;
/*public class day18{
    public static void main(String args[]){
        String s1 = "LSAP";
        String s2 = "LSAP";
        String s3 = new String("LSAP");

        if(s1.equals(s3)){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
}*/

//Substring
/*public static void main(String[] args) {
public class day18 {
    public static void main(String[] args) {
        String str = "LSAP";
        System.out.println(str.substring(0,2));
    }
    // or
        String str = "LSAP";
        System.out.println(subString(str, 0, 2));        
    }

    public static String subString(String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}*/

//Problem find the larget string;
/*public class day18{
    public static void main(String args[]){
        String fruit[] = {"apple", "mango", "banana"};

        String lsargest = fruit[0];
        for (int i = 0; i < fruit.length; i++) {
            if (lsargest.compareTo(fruit[i])<0) {
                lsargest = fruit[i];
            }
        }
        System.out.println(lsargest);
    }
}*/


//String builder;
/*public class day18 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb); 
    }
}*/

//Upper case;
/*public class day18{
    public static void main(String args[]){
        String str = "hi, i am lsap";
        System.out.println(uppercase(str));
    }

    public static String uppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}*/


//String Compression;
/*public class day18 {
    public static void main(String[] args) {
        String str = "aabbc";
        System.out.println(compression(str));
    }
    
    public static String compression(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1) {
                newStr += count.toString(); 
            }
        }
        return newStr;
    }
}*/


//problem count how many time lower case vowels occure in a string entered user,
/*import java.util.*;
public class day18{
    public static void main(String args[]){
        String str = new Scanner(System.in).next();
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("count of vowels is: " + count);
    }
}*/


