package RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode traverseNode = head;
        int listLength = 1;
        while (traverseNode.next != null) {
            traverseNode = traverseNode.next;
            listLength++;
        }
        ListNode currentNode = head;
        for (int i=0; i < listLength-n; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode.next == null) {
            currentNode = null;
        } else {
            currentNode.next = currentNode.next.next;
        }
        return head;
    }
}
