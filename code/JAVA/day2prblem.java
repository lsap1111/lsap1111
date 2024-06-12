/*import java.util.*;
public class day2prblem {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int A = ad.nextInt();
        int B = ad.nextInt();
        int C = ad.nextInt();
        float avg = A/3+B/3+C/3;
        System.out.println(avg);
    }
} */



// public class problem {
//     class Solution {
//         public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//             ListNode head1 = l1;
//             ListNode head2 = l2;
//             int carry = 0;
//             ListNode curr = new ListNode();
//             ListNode head = curr;
//             while(head1 != null || head2 != null || carry == 1){
//                 if(head1 == null && head2 == null){
//                     curr.val = 1;
//                     return head;
//                 }
    
//                 if(head1 == null){
//                     int temp = carry + head2.val;
//                     carry = temp/10;
//                     temp = temp % 10;
//                     head2 = head2.next;
//                     curr.val = temp;
//                     if(carry == 0 && head1 == null && head2 == null)return head;
//                     curr.next = new ListNode();
//                     curr = curr.next;
//                     continue;
//                 }
    
//                 if(head2 == null){
//                     int temp = carry + head1.val;
//                     carry = temp/10;
//                     temp%=10;
//                     head1 = head1.next;
//                     curr.val = temp;
//                     if(carry == 0 && head1 == null && head2 == null)return head;
//                     curr.next = new ListNode();
//                     curr = curr.next;
//                     continue;
//                 }
//                 int temp = carry + head1.val + head2.val;
//                 carry =  temp / 10;
//                 temp%=10;
//                 head1 = head1.next;
//                 head2 = head2.next;
//                 curr.val = temp;
//                 if(carry == 0 && head1 == null && head2 == null) return head;
//                 curr.next = new ListNode();
//                 curr = curr.next;
//             }
//             return head;
//         }
//     }
// }
