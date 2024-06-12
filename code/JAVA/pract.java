public class pract {
    public static void main(String[] args) {
        int number[] = {10, 15, 59, 98, 87, 74, 45, 56, 23};
        int key = 10;

        int index = linearSearch( number, key);
        if (index == -1) {
            System.out.println("Number not found");
        }
        else{
            System.out.println("Key index value is: " + index);
        }
    }
    
    public static int linearSearch(int number[], int key){
        for (int i = 0; i < number.length; i++) {
            if (number [i] == key) {
                return i;
            }
        }
        return -1;
    }
}
          