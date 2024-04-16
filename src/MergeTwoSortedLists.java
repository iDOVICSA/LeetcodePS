public class MergeTwoSortedLists {


    //Definition for singly-linked list.
    public static class ListNode {
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


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        // first iteration to init result
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.val = list1.val;
                list1 = list1.next;
            } else {
                result.val = list2.val;
                list2 = list2.next;
            }
        } else {
            if (list1 != null) return list1;
            return list2;
        }
        ListNode head = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.next = new ListNode(list1.val);
                result = result.next;
                list1 = list1.next;
            }
            else if (list1.val > list2.val) {
                result.next = new ListNode(list2.val);
                result = result.next;
                list2 = list2.next;
            }
            else if (list1.val == list2.val) {
                result.next = new ListNode(list1.val);
                result = result.next;
                result.next = new ListNode(list2.val);
                result = result.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) result.next = list1;
        else result.next = list2;

        return head;
    }

}
