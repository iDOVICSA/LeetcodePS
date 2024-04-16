
// Definition for singly-linked list.


public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sumNodes = 0;
        int retained = 0;
        sumNodes = l1.val + l2.val;
        if (sumNodes > 9) {
            sumNodes = sumNodes - 10;
            retained = 1;
        }
        ListNode result = new ListNode(sumNodes);
        l1 = l1.next;
        l2 = l2.next;
        ListNode sum = result;
        boolean condition = true;
        while (l1 != null && l2 != null) {
            sumNodes = l1.val + l2.val + retained;
            retained = 0;
            if (sumNodes > 9) {
                sumNodes = sumNodes - 10;
                retained = 1;
            }
            result.next = new ListNode(sumNodes);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                sumNodes = l2.val + retained;
                retained = 0;
                if (sumNodes > 9) {
                    sumNodes = sumNodes - 10;
                    retained = 1;
                }
                result.next = new ListNode(sumNodes);
                result = result.next;
                l2 = l2.next;
            }
        } else {
            while (l1 != null) {
                sumNodes = l1.val + retained;
                retained = 0;
                if (sumNodes > 9) {
                    sumNodes = sumNodes - 10;
                    retained = 1;
                }
                result.next = new ListNode(sumNodes);
                result = result.next;
                l1 = l1.next;
            }
        }
        if (retained == 1) result.next = new ListNode(1);
        return sum;
    }
}
