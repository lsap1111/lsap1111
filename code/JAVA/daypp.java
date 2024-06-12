/*public class daypp {
   
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        ListNode curr = new ListNode();
        ListNode head = curr;
        while(head1 != null || head2 != null || carry == 1){
            if(head1 == null && head2 == null){
                curr.val = 1;
                return head;
            }

            if(head1 == null){
                int temp = carry + head2.val;
                carry = temp/10;
                temp = temp % 10;
                head2 = head2.next;
                curr.val = temp;
                if(carry == 0 && head1 == null && head2 == null)return head;
                curr.next = next ListNode();
                curr = curr.next;
                continue;
            }

            if(head2 == null){
                int temp = carry + head1.val;
                carry = temp/10;
                temp%=10;
                head1 = head1.next;
                curr.val = temp;
                if(carry == 0 && head1 == null && head2 == null)return head;
                curr.next = next ListNode();
                curr = curr.next;
                continue;
            }
            int temp = carry + head1.val + head2.val;
            carry =  temp / 10;
            temp%=10;
            head1 = head1.next;
            head2 = head2.next;
            curr.val = temp;
            if(carry == 0 && head1 == null && head2 == null) return head;
            curr.next = new ListNode();
            curr = curr.next;
        }
        return head;
    }
}
}
*/