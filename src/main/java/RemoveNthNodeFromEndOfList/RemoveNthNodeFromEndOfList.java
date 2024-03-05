package RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        for (int i=0; i < n; i++) {
            currentNode = currentNode.next;
        }
        return null;
    }
}
