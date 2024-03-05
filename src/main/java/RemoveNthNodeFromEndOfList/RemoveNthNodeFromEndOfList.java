package RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
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
        if (listLength == n) {
            return head.next;
        }
        replaceNode.next = replaceNode.next.next;
        return head;
    }
}