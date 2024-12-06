package random;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);

        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        list2.next = new ListNode(4);
        list2.next.next = new ListNode(5);

        mergeTwoSortedArrays.mergeTwoLists(list1, list2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        ListNode temp = list1;

        return list1;
    }
}
