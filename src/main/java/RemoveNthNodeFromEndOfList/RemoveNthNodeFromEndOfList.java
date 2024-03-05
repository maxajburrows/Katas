package RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) {
            return null;
        }

        ListNode traverseNode = head;
        ListNode replaceNode = head;
        int listLength = 1;
        while (traverseNode.next != null) {
            traverseNode = traverseNode.next;
            listLength++;
            if (listLength > n+1) {
                replaceNode = replaceNode.next;
            }
        }
//        ListNode currentNode = head;
//        for (int i=0; i < listLength-n-1; i++) {
//            currentNode = currentNode.next;
//        }
        if (listLength == n) {
            replaceNode.val = replaceNode.next.val;
        }
        if (replaceNode.next == null) {
            replaceNode = null;
        } else {
            replaceNode.next = replaceNode.next.next;
        }
        return head;
    }
}