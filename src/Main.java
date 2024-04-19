public class Main {
    public static void main(String[] args) {
        MergeTwoSortedLists.ListNode a = new MergeTwoSortedLists.ListNode(5);
        MergeTwoSortedLists.ListNode b = new MergeTwoSortedLists.ListNode(1);
        b.next = new MergeTwoSortedLists.ListNode(2);
        b.next.next = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.mergeTwoLists(a,b);


        String res = ZigzagConversion.convert("PAYPALISHIRING",4);
    }
}