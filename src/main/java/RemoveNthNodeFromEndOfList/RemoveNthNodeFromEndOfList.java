package RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) {
            return null;
        }

        ListNode traverseNode = head;
        int listLength = 1;
        while (traverseNode.next != null) {
            traverseNode = traverseNode.next;
            listLength++;
        }
        ListNode currentNode = head;
        for (int i=0; i < listLength-n-1; i++) {
            currentNode = currentNode.next;
        }
        if (listLength == n) {
            currentNode.val = currentNode.next.val;
        }
        if (currentNode.next == null) {
            currentNode = null;
        } else {
            currentNode.next = currentNode.next.next;
        }
        return head;
    }
}